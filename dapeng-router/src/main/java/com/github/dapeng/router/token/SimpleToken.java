package com.github.dapeng.router.token;

/**
 * 描述:
 *
 * @author hz.lei
 * @date 2018年04月13日 下午9:01
 */
public class SimpleToken implements Token {

    public final int id;

    public SimpleToken(int id) {
        this.id = id;
    }

    @Override
    public int id() {
        return this.id;
    }

}