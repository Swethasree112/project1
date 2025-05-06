package jdbc.db.connection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class jdbc{

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		// JDBC Connection URLS :
		String url = "jdbc:mysql://root@localhost:3306/users?characterEncoding=utf8";
		String username = "root";
		String password = "swetha123";
		
		int shape_id;
		String shape_type;
		double length,breath,height,radius,side;
		
		String qry = "";

		try {

			int option = 1;

			while (option != 9) {
				
				Connection connection = DriverManager.getConnection(url,username,password);
				
				Statement statement = connection.createStatement();
				ResultSet resultSet;
				
				PreparedStatement preparedStatement;
				
				System.out.println("\nMySQL Database Connectivity....");
				System.out.println("\t1. Insert data");
				System.out.println("\t2. Update data");
				System.out.println("\t3. View data");
				System.out.println("\t4. Delete data");
				System.out.println("\t9. Quit");
				System.out.println("\nEnter Your Choice : ");
				option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.printf("\nInsert data");
					scanner.nextLine();
					System.out.printf("\nEnter your shape_id : ");
					shape_id = scanner.nextInt();
					System.out.printf("Enter Your shape_type  : ");
					scanner.nextLine();
				    shape_type = scanner.nextLine();
					
					System.out.printf("Enter length: ");
					length = scanner.nextDouble();
					System.out.printf("Enter breath : ");
					breath = scanner.nextDouble();
					System.out.printf("Enter height : ");
					height = scanner.nextDouble();
					System.out.printf("Enter radius : ");
					radius = scanner.nextDouble();
					System.out.printf("Enter side : ");
					side = scanner.nextDouble();
					
					qry = "INSERT INTO users.shapes(shape_id,shape_type,length,breath,height,radius,side) VALUES (?,?, ?, ?, ?,?,?)";
					preparedStatement = connection.prepareStatement(qry); 
					
					preparedStatement.setInt(1,shape_id);
					preparedStatement.setString(2,shape_type);
					preparedStatement.setDouble(3,length);
					preparedStatement.setDouble(4, breath);
					preparedStatement.setDouble(5, height);
					preparedStatement.setDouble(6, radius);
					preparedStatement.setDouble(7, side);

					preparedStatement.executeUpdate();
					
					System.out.println("\nYour Data Save DONE....");
					
					break;
				case 2:
					System.out.println("\nUpdate data");
					scanner.nextLine();
					System.out.printf("\nEnter your shape_id : ");
					shape_id = scanner.nextInt();
					System.out.printf("Enter Your shape_type  : ");
				    shape_type = scanner.nextLine();
					scanner.nextLine();
					System.out.printf("Enter length: ");
					length = scanner.nextDouble();
					System.out.printf("Enter breath : ");
					breath = scanner.nextDouble();
					System.out.printf("Enter height : ");
					height = scanner.nextDouble();
					System.out.printf("Enter radius : ");
					radius = scanner.nextDouble();
					System.out.printf("Enter side : ");
					side = scanner.nextDouble();
					
					
					qry = "UPDATE users.shapes SET shape_id = ?, shape_type = ?, length = ?, breath = ?,height = ? ,radius= ?,side=? WHERE (shape_id= ?)";
					
					preparedStatement = connection.prepareStatement(qry);
					preparedStatement.setInt(1,shape_id);
					preparedStatement.setString(2,shape_type);
					preparedStatement.setDouble(3,length);
					preparedStatement.setDouble(4, breath);
					preparedStatement.setDouble(5, height);
					preparedStatement.setDouble(6, radius);
					preparedStatement.setDouble(7, side);
					
					preparedStatement.executeUpdate();
					
					System.out.println("\n Your Data Update DONE....");
					break;
				case 3:
					System.out.println("\nView data,");
					qry = "SELECT * FROM users.shapes";
					resultSet = statement.executeQuery(qry);
					
					while (resultSet.next()) {
						shape_id = resultSet.getInt("shape_id");
						shape_type= resultSet.getString("shape_type");
						length= resultSet.getDouble("length");
						breath = resultSet.getDouble("breath");
						height = resultSet.getDouble("height");
					    radius=resultSet.getDouble("radius");
						side=resultSet.getDouble("side");
						System.out.println(shape_id + ", " + shape_type + ", " + length + ", " + breath + ", " + height+ ", "+ radius + ", "+side);

					}
					break;
				case 4:
					System.out.println("\nDelete data,");
					
					System.out.printf("\nEnter Deleting Id : ");
					shape_id = scanner.nextInt();
					
					qry = "DELETE FROM users.shapes WHERE (shape_id = ?)";
					
					preparedStatement = connection.prepareStatement(qry);
					preparedStatement.setInt(1, shape_id);
					preparedStatement.executeUpdate();
					
					System.out.println("Data Delete Success...");
					break;
				case 9:
					System.out.println("\n\nProgram ends now....");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Option try again...");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("\n\nError :- " + e.getMessage());
		}

	}

}
