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
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM [USER]"
            );
            
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                User user = new User(
                        rs.getInt("ID_User"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getURL("ProfilePicture"),
                        rs.getString("Email"),
                        rs.getBoolean("isAdmin")
                );
                users.add(user);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return users;
    }
    
    public ArrayList<Place> getPlaces() {
        ArrayList<Place> places = new ArrayList<>();
        try(Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM PLACE"
            );
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
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
        try(Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM PICTURES"
            );
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                Pictures picture = new Pictures(
                        rs.getInt("ID_Picture"),
                        rs.getURL("URL"),
                        rs.getInt("Place")
                );
                pictures.add(picture);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return pictures;
    }
    
    public ArrayList<Comment> getComments() {
        ArrayList<Comment> comments = new ArrayList<>();
        try(Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM COMMENT"
            );
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
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
        } catch(Exception e) {
            e.printStackTrace();
        }
        return comments;
    }
}
