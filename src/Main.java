public class Main {

    public static void main(String[] args) {

        DBFactory dbFactory;
        Connection connection;
        Statement statement;

        dbFactory = new OrcFactory();
        connection = dbFactory.creatConnect();
        statement = dbFactory.creatStatement();
        statement.execStatement();



    }
}
