package spdvi.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import spdvi.POJOs.Comment;
import spdvi.POJOs.Pictures;
import spdvi.POJOs.Place;
import spdvi.POJOs.User;

public class DataAccess {

    private Connection getConnection() {
        Connection connection = null;
        Properties properties = new Properties();
        try {
            properties.load(DataAccess.class.getClassLoader().getResourceAsStream("database.properties"));
            connection = DriverManager.getConnection(properties.getProperty("url"), properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM [USER]"
            );

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                User user = new User(
                        rs.getInt("ID_User"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getString("UserEmail"),
                        rs.getBoolean("isAdmin")
                );
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public User getUser(String username) {
        User user = null;
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM [USER] WHERE Username = ? or UserEmail = ?"
            );
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, username);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                user = new User(
                        rs.getInt("ID_User"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getString("UserEmail"),
                        rs.getBoolean("isAdmin")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public void grantAdmin(String username) {
        try ( Connection con = getConnection();) {
            PreparedStatement updateStatement = con.prepareStatement(
                    "UPDATE dbo.[User] SET isAdmin = 1 WHERE Username = ?"
            );
            updateStatement.setString(1, username);

            int result = updateStatement.executeUpdate();
            System.out.println(result + " rows affected");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public boolean userExists(String username, String email) {
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT COUNT(*) AS 'result' FROM [USER] WHERE Username like ?  or UserEmail like ?"
            );
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                if (rs.getInt("result") == 0) {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public ArrayList<Place> getPlaces() {
        ArrayList<Place> places = new ArrayList<>();
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM PLACE"
            );
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Place place = new Place(
                        rs.getInt("Registre"),
                        rs.getString("Name"),
                        rs.getString("Description"),
                        rs.getString("Municipality"),
                        rs.getString("Address"),
                        rs.getString("PlaceEmail"),
                        rs.getString("Web"),
                        rs.getString("PhoneNumber"),
                        rs.getBoolean("isVisible"),
                        rs.getString("Type")
                );
                places.add(place);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return places;
    }

    public ArrayList<Place> getPreviewData() {
        ArrayList<Place> places = new ArrayList<>();
        try ( Connection connection = getConnection()) {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT p.Registre, p.[Name], p.[Municipality], p.[Address], cast(p.[Description] as nvarchar(1000)) as 'Description', p.[PlaceEmail], p.[Web], p.[PhoneNumber], p.[isVisible], p.[Type],COUNT(ID_Comment) as 'placeComments', avg(rating) as 'avgRating' FROM dbo.PLACE p left join dbo.COMMENT c on c.Registre = p.Registre group by p.Registre, p.[Name], p.[Municipality], cast(p.[Description] as nvarchar(1000)), p.[Address], p.[PlaceEmail], p.[Web], p.[PhoneNumber], p.[isVisible], p.[Type];");
            while (rs.next()) {
                Place place = new Place(
                        rs.getInt("Registre"),
                        rs.getString("Name"),
                        rs.getString("Description"),
                        rs.getString("Municipality"),
                        rs.getString("Address"),
                        rs.getString("PlaceEmail"),
                        rs.getString("Web"),
                        rs.getString("PhoneNumber"),
                        rs.getBoolean("isVisible"),
                        rs.getString("Type"),
                        rs.getInt("placeComments"),
                        rs.getInt("avgRating")
                );
                places.add(place);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return places;
    }

    public ArrayList<Pictures> getPictures() {
        ArrayList<Pictures> pictures = new ArrayList<>();
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM PICTURES"
            );
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Pictures picture = new Pictures(
                        rs.getInt("ID_Picture"),
                        rs.getURL("URL"),
                        rs.getInt("PlaceRegistr")
                );
                pictures.add(picture);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pictures;
    }

    public ArrayList<String> getPlacePictures(Place place) {
        ArrayList<String> pictures = new ArrayList<>();
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM PICTURES where PlaceRegistre = ?"
            );
            preparedStatement.setInt(1, place.getRegistre());
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                pictures.add(rs.getString("URL"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pictures;
    }

    public ArrayList<Comment> getComments() {
        ArrayList<Comment> comments = new ArrayList<>();
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM COMMENT"
            );
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Comment comment = new Comment(
                        rs.getInt("ID_Comment"),
                        rs.getString("Text"),
                        rs.getDate("DateTime"),
                        rs.getInt("Rating"),
                        rs.getInt("ID_User"),
                        rs.getInt("Registre")
                );
                comments.add(comment);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return comments;
    }

    public ArrayList<Comment> getComments(Place place) {
        ArrayList<Comment> comments = new ArrayList<>();
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select * from COMMENT join [USER] on COMMENT.ID_User = [USER].ID_User where Registre = ?"
            );
            preparedStatement.setInt(1, place.getRegistre());
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Comment comment = new Comment(
                        rs.getInt("ID_Comment"),
                        rs.getString("Text"),
                        rs.getDate("DateTime"),
                        rs.getInt("Rating"),
                        rs.getInt("ID_User"),
                        rs.getInt("Registre"),
                        rs.getString("Username")
                );
                comments.add(comment);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return comments;
    }

    public void createUser(User user) {
        try ( Connection con = getConnection();) {
            PreparedStatement insertStatement = con.prepareStatement(
                    "INSERT INTO dbo.[User] (Username, Password, ProfilePicture, UserEmail, isAdmin) "
                    + "VALUES (?,?,?,?, ?)");

            insertStatement.setString(1, user.getUsername());
            insertStatement.setString(2, user.getPassword());
            insertStatement.setString(3, "Foto");
            insertStatement.setString(4, user.getEmail());
            insertStatement.setBoolean(5, user.isIsAdmin());

            int result = insertStatement.executeUpdate();
            System.out.println(result + " rows affected");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public void updatePassword(String password, String email) {
        try ( Connection con = getConnection();) {
            PreparedStatement updateStatement = con.prepareStatement(
                    "UPDATE dbo.[User] SET Password = ? WHERE UserEmail = ?"
            );
            updateStatement.setString(1, password);
            updateStatement.setString(2, email);

            int result = updateStatement.executeUpdate();
            System.out.println(result + " rows affected");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public void updateUsername(String username, String email) {
        try ( Connection con = getConnection();) {
            PreparedStatement updateStatement = con.prepareStatement(
                    "UPDATE dbo.[User] SET Username = ? WHERE UserEmail = ?"
            );
            updateStatement.setString(1, username);
            updateStatement.setString(2, email);

            int result = updateStatement.executeUpdate();
            System.out.println(result + " rows affected");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
    public void deleteComment(int id) {
        try(Connection con = getConnection();) {
            PreparedStatement updateStatement = con.prepareStatement(
                    "DELETE [dbo].[COMMENT] WHERE ID_User = ?"
            );
            updateStatement.setInt(1, id);
            
            int result = updateStatement.executeUpdate();
            System.out.println(result + " rows affected");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    public void deleteUser(String email) {
        try ( Connection con = getConnection();) {
            PreparedStatement updateStatement = con.prepareStatement(
                    "DELETE dbo.[User] WHERE UserEmail = ?"
            );
            updateStatement.setString(1, email);

            int result = updateStatement.executeUpdate();
            System.out.println(result + " rows affected");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
    public void updatePlace(String name, String description, String municipality, String address, String placeEmail, String web, String phoneNumber, String type, int registre) {
        try(Connection con = getConnection();) {
            PreparedStatement updateStatement = con.prepareStatement(
                        "UPDATE [dbo].[PLACE] SET Name = ?, "
                                + "Description = ?, "
                                + "Municipality = ?, "
                                + "Address = ?, "
                                + "PlaceEmail = ?, "
                                + "Web = ?, "
                                + "PhoneNumber = ?, "
                                + "Type = ? "
                                + "WHERE REGISTRE = ?;"
            );
            updateStatement.setString(1, name);
            updateStatement.setString(2, description);
            updateStatement.setString(3, municipality);
            updateStatement.setString(4, address);
            updateStatement.setString(5, placeEmail);
            updateStatement.setString(6, web);
            updateStatement.setString(7, phoneNumber);
            updateStatement.setString(8, type);
            updateStatement.setInt(9, registre);
            
            int result = updateStatement.executeUpdate();
            System.out.println(result + " rows affected");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
    public void  updatePlaceMunicipality(String value, int registre) {
        try(Connection con = getConnection();) {
            PreparedStatement updateStatement = con.prepareStatement(
                        "UPDATE dbo.[PLACE] SET Municipality = ? WHERE Registre = ?"
            );
            updateStatement.setString(1, value);
            updateStatement.setInt(2, registre);
            
            int result = updateStatement.executeUpdate();
            System.out.println(result + " rows affected");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
    public void  updatePlaceType(String value, int registre) {
        try(Connection con = getConnection();) {
            PreparedStatement updateStatement = con.prepareStatement(
                        "UPDATE dbo.[PLACE] SET Type = ? WHERE Registre = ?"
            );
            updateStatement.setString(1, value);
            updateStatement.setInt(2, registre);
            
            int result = updateStatement.executeUpdate();
            System.out.println(result + " rows affected");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    public ArrayList<String> getDistinctTypes() {
        ArrayList<String> types = new ArrayList<>();
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select distinct PLACE.Type from PLACE"
            );
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String type = rs.getString("Type");
                types.add(type);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return types;
    }

    public ArrayList<String> getDistinctMunicipalyties() {
        ArrayList<String> municipalities = new ArrayList<>();
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select distinct PLACE.Municipality from PLACE"
            );
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String municipality = rs.getString("Municipality");
                municipalities.add(municipality);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return municipalities;
    }

    public void newPlace(Place place) {
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into PLACE (Name,Description,Municipality,Address,PlaceEmail,Web,PhoneNumber,isVisible,Type,Registre) values (?,?,?,?,?,?,?,?,?,?);");
            preparedStatement.setString(1, place.getName());
            preparedStatement.setString(2, place.getDescription());
            preparedStatement.setString(3, place.getMunicipality());
            preparedStatement.setString(4, place.getAddress());
            preparedStatement.setString(5, place.getEmail());
            preparedStatement.setString(6, place.getWeb());
            preparedStatement.setString(7, place.getPhoneNumber());
            preparedStatement.setBoolean(8, place.isVisible());
            preparedStatement.setString(9, place.getType());
            preparedStatement.setInt(10, place.getRegistre());
            preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getPlaceRegistre() {
        int placeRegistre = 0;
        try ( Connection connection = getConnection()) {
            Statement registreStatement = connection.createStatement();
            ResultSet registreResultSet = registreStatement.executeQuery("select max(registre) + 1 as registre from place");
            if (registreResultSet.next()) {
                placeRegistre = registreResultSet.getInt("registre");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return placeRegistre;
    }

    public void insertImage(String image, int registre) {
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into PICTURES (URL, PlaceRegistre) values (?,?);");
            preparedStatement.setString(1, image);
            preparedStatement.setInt(2, registre);
            preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertImages(String[] images, int registre) {
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into PICTURES (URL, PlaceRegistre) values (?,?);");
            for (String image : images) {
                preparedStatement.setString(1, image);
                preparedStatement.setInt(2, registre);
                preparedStatement.executeQuery();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getCommentCount(Place place) {
        int commentCount = 0;
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT count(*) count FROM COMMENT where Registre like ?");
            preparedStatement.setInt(1, place.getRegistre());
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                commentCount = rs.getInt("count");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return commentCount;
    }

    public int getAverageRating(Place place) {
        int avg = 0;
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT avg(Rating) average FROM COMMENT where Registre like ?");
            preparedStatement.setInt(1, place.getRegistre());
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                avg = rs.getInt("average");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return avg;
    }

    public String getFirstImage(Place place) {
        String image = "";
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("select PICTURES.URL from PICTURES where PlaceRegistre = ?");
            preparedStatement.setInt(1, place.getRegistre());
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                image = rs.getString("URL");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }

    public void newComment(Comment comment) {
        try ( Connection connection = getConnection()) {
            PreparedStatement pst = connection.prepareStatement("Insert into COMMENT (Text, DateTime, Rating, ID_User, Registre) values (?,?,?,?,?);");
            pst.setString(1, comment.getText());
            pst.setString(2, comment.getDateTime().toString());
            pst.setInt(3, comment.getRating());
            pst.setInt(4, comment.getIdUser());
            pst.setInt(5, comment.getRegistre());
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setVisible(int registre, boolean visibility) {
        try ( Connection connection = getConnection()) {
            PreparedStatement pst = connection.prepareStatement("UPDATE dbo.[Place] SET isVisible = ? WHERE Registre = ?");
            pst.setBoolean(1, visibility);
            pst.setInt(2, registre);
            int result = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
