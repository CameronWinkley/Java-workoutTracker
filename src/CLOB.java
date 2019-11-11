import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CLOB {

    public boolean storeCLOB(String prodLine, InputStreamReader inStream) throws Exception {
        String sqlString =
                "UPDATE ProductLines SET htmlDescription = ? where ProductLine = ?";

        try(Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/exercise?user=root&password=root&");

            PreparedStatement preparedStatement = connection.prepareStatement(sqlString);) {
            preparedStatement.setString(2, prodLine);

            preparedStatement.setCharacterStream(1, inStream);

            preparedStatement.executeUpdate();

            return true;
        }


    }
}
