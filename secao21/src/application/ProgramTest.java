package secao21.src.application;

// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;

// import secao21.src.db.DB;
// import secao21.src.db.DBException;
// import secao21.src.db.DBIntegrityException;

public class ProgramTest {
    public static void main(String[] args) {


        //TRANSAÇÃO
        //
        // Connection conn = null;
        // Statement st = null;

        // try{
        //     conn = DB.getConnection();
            
        //     conn.setAutoCommit(false);

        //     st = conn.createStatement();
            
        //     int rows1 = st.executeUpdate(
        //         "UPDATE seller SET BaseSalary = 2090 "+
        //         "WHERE DepartmentId = 1");

        //     //int x = 1;
        //     //if(x < 2) throw new SQLException("Fake ERROR");

        //     int rows2 = st.executeUpdate(
        //         "UPDATE seller SET BaseSalary = 3090 "+
        //         "WHERE DepartmentId = 2");

        //     conn.commit();

        //     System.out.println("ROWS1: "+rows1);
        //     System.out.println("ROWS2: "+rows2);

        // } catch(SQLException e){
        //     try {
        //         conn.rollback();
        //         throw new DBException("Transaction rolled back! Caused by: "+ e.getMessage());
        //     } catch (SQLException e1) {
        //         throw new DBException("ERROR rolling back! Caused by: "+ e1.getMessage());
        //     }
        // } finally {
        //     DB.closeStatement(st);
        //     DB.closeConnection();
        // }


        //APAGAR
        //
        // Connection conn = null;
        // PreparedStatement st = null;

        // try{
        //     conn = DB.getConnection();
        //     st = conn.prepareStatement(
        //         "DELETE FROM department "+
        //         "WHERE "+
        //         "Id = ?");
        //     st.setInt(1, 2);
        //     int rowsAffected = st.executeUpdate();

        //     System.out.println("DONE! - "+rowsAffected+" ROWS AFFECTED!");
        // } catch(SQLException e){
        //     throw new DBIntegrityException(e.getMessage());
        // } finally {
        //     DB.closeStatement(st);
        //     DB.closeConnection();
        // }


        //ATUALIZAÇÃO
        //
        // Connection conn = null;
        // PreparedStatement st = null;

        // try{
        //     conn = DB.getConnection();
        //     st = conn.prepareStatement(
        //         "UPDATE seller "+
        //         "SET BaseSalary = BaseSalary + ? "+
        //         "WHERE "+
        //         "(DepartmentId = ?)");
        //     st.setDouble(1, 200.00);
        //     st.setInt(2, 2);
        //     int rowsAffected = st.executeUpdate();

        //     System.out.println("DONE! - "+rowsAffected+" ROWS AFFECTED!");
        // } catch(SQLException e){
        //     throw new DBException(e.getMessage());
        // } finally {
        //     DB.closeStatement(st);
        //     DB.closeConnection();
        // }

        //INSERÇÃO
        //
        // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Connection conn = null;
        // PreparedStatement st = null;

        // try{
        //     conn = DB.getConnection();
        //     // st = conn.prepareStatement(
        //     //     "insert into seller"+
        //     //     "(Name,Email,BirthDate,BaseSalary,DepartmentId)"+
        //     //     "values"+
        //     //     "(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
        //     // st.setString(1, "Carl Purple");
        //     // st.setString(2, "carl@gmail.com");
        //     // st.setDate(3, 
        //     //     new java.sql.Date(sdf.parse("22/04/1985").getTime()));
        //     // st.setDouble(4, 3450.90);
        //     // st.setInt(5, 4);

        //     st = conn.prepareStatement(
        //         "insert into department (Name) values ('D1'),('D2')",
        //         Statement.RETURN_GENERATED_KEYS);

        //     int rowsAffected = st.executeUpdate();
        //     if(rowsAffected > 0){
        //         ResultSet rs = st.getGeneratedKeys();
        //         while(rs.next()){
        //             int id = rs.getInt(1);
        //             System.out.println("DONE! - ID = "+id);
        //         }
        //     }
        //     else{
        //         System.out.println("NO ROWS AFFECTED!");
        //     }

        // } catch(SQLException e){
        //     throw new DBException(e.getMessage());
        // // } catch(ParseException e){
        // //     throw new DBException(e.getMessage());
        // } finally{
        //     DB.closeStatement(st);
        //     DB.closeConnection();
        // }

        
        // CONSULTA
        //
        // Statement st = null;
        // ResultSet rs = null;
        // try {
        //    conn = DB.getConnection();
        //    st = conn.createStatement();
        //    rs = st.executeQuery("select * from department");
        //    while(rs.next()){
        //        System.out.println(rs.getInt("Id")+", "+
        //             rs.getString("Name"));
        //    }
        // } catch (SQLException e) {
        //     throw new DBException(e.getMessage());
        // } finally{
        //     DB.closeResultSet(rs);
        //     DB.closeStatement(st);
        //     DB.closeConnection();
        // }

    }
}
