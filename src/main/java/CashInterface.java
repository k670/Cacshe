public interface CashInterface {
    public void init(long count);
    public UserModel get(long id);
    public UserModel update(long id, String fn, String ln);
    public void showAll();
}
