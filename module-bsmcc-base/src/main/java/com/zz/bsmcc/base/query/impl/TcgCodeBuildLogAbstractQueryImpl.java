package com.zz.bsmcc.base.query.impl;


import com.zz.bms.core.db.mybatis.query.QueryImpl;
import com.zz.bsmcc.base.domain.TcgCodeBuildLogEntity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 代码生成记录 查询抽象类
 * 用于链式查询
 * @author Administrator
 * @date 2018-8-5 15:15:56
 */
public abstract class TcgCodeBuildLogAbstractQueryImpl<PK extends Serializable> extends QueryImpl<TcgCodeBuildLogEntity,PK> {






            protected PK id;
            protected PK id_NE;












            protected PK projectId;
            protected PK projectId_NE;












            protected PK templetGroupId;
            protected PK templetGroupId_NE;












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






	
}