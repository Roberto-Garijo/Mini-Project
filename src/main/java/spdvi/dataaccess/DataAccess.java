package spdvi.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            properties.load(DataAccess.class.getClassLoader().getResourceAsStream("application.properties"));
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
                    "SELECT * FROM COMMENT where Registre = ?"
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
                        rs.getInt("Registre")
                );
                comments.add(comment);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return comments;
    }

    public void createUser() {

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

    }

    public int getCommentCount(Place place) {
        int commentCount = 0;
        try ( Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT count(*) count FROM COMMENT where Registre like ?");
            preparedStatement.setInt(1, place.getRegistre());
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            commentCount = rs.getInt("count");
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
            rs.next();
            avg = rs.getInt("average");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return avg;
    }
}
