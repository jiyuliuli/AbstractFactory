public class OrcFactory implements DBFactory {
    @Override
    public Connection creatConnect() {
        return null;
    }

    @Override
    public Statement creatStatement() {
        return new OrcStatement();
    }

}
