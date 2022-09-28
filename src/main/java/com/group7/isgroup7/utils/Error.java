package com.group7.isgroup7.utils;

public enum Error {
    OK(0,"文件上传符合规范"),
    //-1到-9 为系统出错如数据库
    INSERTERROR(-1,"插入错误"),
    SELECTERROR(-2,"查询错误"),
    DELETEERROR(-3,"删除错误"),
    UPDATEERROR(-4,"更新错误"),
    NULLPOINTERERROR(-5,"数据出错或者数据缺失"),
    PARSEERROR(-6,"日期转变出错"),
    LOGINERROR(-100,"登录失败"),
    CHANGEPWDERROR(-101,"修改密码失败"),
    AGEERROR(-102,"年龄不符合"),
    ROLEERROR(-103,"权限不符合"),
    REPEATERROR(-104,"重复操作"),
    BATCHERROR(-105,"批次出错"),
    STEPERROR(-106,"步骤出错"),
    STATUSERROR(-107,"状态出错"),
    POLICYERROR(-108,"政审不合格"),
    TIMEERROR(-109,"时间错误"),
    REPORTREPEATERROR(-110,"思想报告一季度重复提交"),
    REPORTTIMEERROR(-111,"思想报告时间错误"),
    PROFILEERROR(-112,"个人简介错误：时间从9月开始，7月结束，并且最后的学习经历从9月到至今"),
    //-200开始为流和文件异常部分
    IOEXCEPTION(-200,"流发生异常"),
    FILEERROR(-201,"文件错误"),
    FILEEMPTYERROR(-202,"文件为空"),
    FILEUPLOADERROR(-203,"文件上传失败"),
    FILEWRONGERROR(-204,"图片不存在或图片已损毁"),
    SIZEERROR(-205,"文件大小不符合要求"),

    TYPEERROR(-206,"文件类型不符合规范"),
    WIDTHORHEIGHTERROR(-207,"图片尺寸不符合规范"),
    FILECREATEERROR(-208,"文件生成失败"),
    TIMEOUT(-209,"验证码已过期")


    ;
    private Integer code;
    private String msg;

    Error(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
