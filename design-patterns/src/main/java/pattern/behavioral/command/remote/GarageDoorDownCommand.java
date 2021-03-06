package pattern.behavioral.command.remote;

import pattern.behavioral.command.Command;
import pattern.behavioral.command.furniture.GarageDoor;
/**
 * 实现产品的命令接口
 *
 * @author leishiguang
 * date  2018/8/14 14:21
 * @version v1.0
 */
public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
        garageDoor.down();
        garageDoor.lightOff();
    }
}
