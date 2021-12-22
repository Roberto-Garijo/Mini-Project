package spdvi.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
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
        try (Connection connection = getConnection()) {
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
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM [USER] WHERE Username = '?'"
            );
            preparedStatement.setString(1, username);
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
    
    public boolean isAdmin(String username) {
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT isAdmin FROM [USER] WHERE Username like ?"
            );
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                if (rs.getBoolean("isAdmin") == false) {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean userExists(String username, String email) {
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT COUNT(*) AS 'result' FROM [USER] WHERE Username like ?  or UserEmail like ?"
            );
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                if (rs.getInt(1) == 0) {
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
        try (Connection connection = getConnection()) {
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

    public ArrayList<Pictures> getPictures() {
        ArrayList<Pictures> pictures = new ArrayList<>();
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM PICTURES"
            );
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Pictures picture = new Pictures(
                        rs.getInt("ID_Picture"),
                        rs.getURL("URL"),
                        rs.getInt("Place")
                );
                pictures.add(picture);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pictures;
    }

    public ArrayList<Comment> getComments() {
        ArrayList<Comment> comments = new ArrayList<>();
        try (Connection connection = getConnection()) {
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
        try (Connection connection = getConnection()) {
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
        try (Connection con = getConnection();) {
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

    public ArrayList<String> getDistinctTypes() {
        ArrayList<String> types = new ArrayList<>();
        try (Connection connection = getConnection()) {
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
        try (Connection connection = getConnection()) {
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

    }

    public int getCommentCount(Place place) {
        int commentCount = 0;
        try (Connection connection = getConnection()) {
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
        try (Connection connection = getConnection()) {
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
        try (Connection connection = getConnection()) {
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
        try (Connection connection = getConnection()) {
            Statement st = connection.createStatement();
            st.executeUpdate("select PICTURES.URL from PICTURES where PlaceRegistre = ?");
//            if (rs.next()) {
//                image = rs.getString("URL");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
