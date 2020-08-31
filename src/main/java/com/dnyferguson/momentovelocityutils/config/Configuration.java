package com.dnyferguson.momentovelocityutils.config;

public class Configuration {
    private boolean test;
    private MySQLConfig mysql;
    private KickingConfig kicking;

    public Configuration() {}

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

    public MySQLConfig getMysql() {
        return mysql;
    }

    public void setMysql(MySQLConfig mysql) {
        this.mysql = mysql;
    }

    public KickingConfig getKicking() {
        return kicking;
    }

    public void setKicking(KickingConfig kicking) {
        this.kicking = kicking;
    }
}
