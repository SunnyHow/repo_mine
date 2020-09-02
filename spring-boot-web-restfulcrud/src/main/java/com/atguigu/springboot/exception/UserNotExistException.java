package com.atguigu.springboot.exception;

/**
 * @Author SunHao
 * @Date 2020/8/28 15:25
 */
public class UserNotExistException extends RuntimeException{
    public UserNotExistException() {
        super("用户不存在");
    }
}
