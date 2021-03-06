package com.zz.bsmcc.base.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bsmcc.base.domain.TcgTempletGroupEntity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 模板组 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-8-5 15:16:00
 */
public abstract class TcgTempletGroupAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TcgTempletGroupEntity,PK> {






            protected PK id;
            protected PK id_NE;












            protected String groupName;
            protected String groupName_NE;
            protected String groupName_LIKE;
            protected String groupName_NOTLIKE;












            protected String groupRemark;
            protected String groupRemark_NE;
            protected String groupRemark_LIKE;
            protected String groupRemark_NOTLIKE;












        protected Timestamp createTime;
        protected Timestamp createTime_NE;
        protected Timestamp createTime_GT;
        protected Timestamp createTime_GE;
        protected Timestamp createTime_LT;
        protected Timestamp createTime_LE;










            protected PK createUserId;
            protected PK createUserId_NE;












        protected Timestamp updateTime;
        protected Timestamp updateTime_NE;
        protected Timestamp updateTime_GT;
        protected Timestamp updateTime_GE;
        protected Timestamp updateTime_LT;
        protected Timestamp updateTime_LE;










            protected PK updateUserId;
            protected PK updateUserId_NE;













        protected Integer versionNo;
        protected Integer versionNo_NE;
        protected Integer versionNo_GT;
        protected Integer versionNo_GE;
        protected Integer versionNo_LT;
        protected Integer versionNo_LE;










            protected String deleteFlag;
            protected String deleteFlag_NE;









	
}