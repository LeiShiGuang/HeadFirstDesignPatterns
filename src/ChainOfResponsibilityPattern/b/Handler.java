package ChainOfResponsibilityPattern.b;

/**
 * @author LeiShiGuang
 * Date  2018/10/27 11:47
 * @version v1.0
 */
public interface Handler {
    void handLeave(LeaveNote leaveNote);

    void setNextHandler(Handler h);
}