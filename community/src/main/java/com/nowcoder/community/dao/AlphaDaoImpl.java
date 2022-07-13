package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author zeng yi
 */

@Repository
public class AlphaDaoImpl implements AlphaDao{
    @Override
    public String select() {
        return "HELLO";
    }
}
