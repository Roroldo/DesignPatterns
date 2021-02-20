package com.roroldo.behavioralPatterns.command;

/**
 * 命令接口
 * @author 落霞不孤
 */
public interface Command {
    void execute();
    void undo();
}
