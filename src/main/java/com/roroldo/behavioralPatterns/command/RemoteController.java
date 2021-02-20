package com.roroldo.behavioralPatterns.command;

/**
 * 远程遥控器
 * @author 落霞不孤
 */
public class RemoteController {
    // 开按钮的命令数组
    Command[] onCommands;
    // 关按钮命令数组
    Command[] offCommands;

    Command undoCommand;

    // 遥控器完成对按钮初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    // 按下开按钮
    public void onButtonWasPushed(int no) {
        onCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    // 按下关按钮
    public void offButtonWasPushed(int no) {
        offCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    // 按下撤销按钮
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
