package com.cxytiandi.sharding.po;

import java.io.Serializable;

/**
 * 分表
 * @author yinjihuan
 *
 */
public class Order implements Serializable {

	private static final long serialVersionUID = -1205226416664488559L;
	
	private Long id;

	private Long userId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
