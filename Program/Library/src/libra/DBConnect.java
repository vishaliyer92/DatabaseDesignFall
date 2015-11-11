package libra;


import java.sql.*;



public class DBConnect extends javax.swing.JFrame {
    
    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","romi");
            st = con.createStatement();
            
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    /*public void getData(){
        try{
            String query = "select * from library_branch";
            rs = st.executeQuery(query);
            System.out.println("Records from Database");
            while(rs.next()){
                String bid = rs.getString("Branch_Id");
                String bname = rs.getString("Branch_Name");
                String add = rs.getString("Address");
                     System.out.println("Branch_Id: "+bid+"  "+"Branch_name: "+bname+"  "+"Address: "+add);
                             
            }
    }catch(Exception ex){
        System.out.println("Error: "+ex);
    }
}*/
}
