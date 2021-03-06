package com.zz.bsmcc.base.query;


import com.zz.bms.core.db.mybatis.query.Query;
import com.zz.bsmcc.base.domain.TcgTempletEntity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.math.BigDecimal;

/**
 * 模板查询接口
 *
 * @author Administrator
 * @date 2018-8-5 15:16:00
 */
public interface TcgTempletQuery<PK extends Serializable> extends Query<TcgTempletEntity,PK> {






            public TcgTempletQuery id(PK id);
            public TcgTempletQuery idNot(PK idNot);
            public TcgTempletQuery idIn(PK idIn);
            public TcgTempletQuery idNotIn(PK idNotIn);
            public TcgTempletQuery idIsNull();
            public TcgTempletQuery idIsNotNull();












            public TcgTempletQuery groupId(PK groupId);
            public TcgTempletQuery groupIdNot(PK groupIdNot);
            public TcgTempletQuery groupIdIn(PK groupIdIn);
            public TcgTempletQuery groupIdNotIn(PK groupIdNotIn);
            public TcgTempletQuery groupIdIsNull();
            public TcgTempletQuery groupIdIsNotNull();












            public TcgTempletQuery fileOutDir(String fileOutDir);
            public TcgTempletQuery fileOutDirNot(String fileOutDirNot);
            public TcgTempletQuery fileOutDirIn(String fileOutDirIn);
            public TcgTempletQuery fileOutDirNotIn(String fileOutDirNotIn);
            public TcgTempletQuery fileOutDirLike(String fileOutDirLike);
            public TcgTempletQuery fileOutDirNotLike(String fileOutDirNotLike);
            public TcgTempletQuery fileOutDirIsNull();
            public TcgTempletQuery fileOutDirIsNotNull();












            public TcgTempletQuery fileInnerDir(String fileInnerDir);
            public TcgTempletQuery fileInnerDirNot(String fileInnerDirNot);
            public TcgTempletQuery fileInnerDirIn(String fileInnerDirIn);
            public TcgTempletQuery fileInnerDirNotIn(String fileInnerDirNotIn);
            public TcgTempletQuery fileInnerDirLike(String fileInnerDirLike);
            public TcgTempletQuery fileInnerDirNotLike(String fileInnerDirNotLike);
            public TcgTempletQuery fileInnerDirIsNull();
            public TcgTempletQuery fileInnerDirIsNotNull();












            public TcgTempletQuery fileType(String fileType);
            public TcgTempletQuery fileTypeNot(String fileTypeNot);
            public TcgTempletQuery fileTypeIn(String fileTypeIn);
            public TcgTempletQuery fileTypeNotIn(String fileTypeNotIn);
            public TcgTempletQuery fileTypeLike(String fileTypeLike);
            public TcgTempletQuery fileTypeNotLike(String fileTypeNotLike);
            public TcgTempletQuery fileTypeIsNull();
            public TcgTempletQuery fileTypeIsNotNull();












            public TcgTempletQuery fileSuffix(String fileSuffix);
            public TcgTempletQuery fileSuffixNot(String fileSuffixNot);
            public TcgTempletQuery fileSuffixIn(String fileSuffixIn);
            public TcgTempletQuery fileSuffixNotIn(String fileSuffixNotIn);
            public TcgTempletQuery fileSuffixLike(String fileSuffixLike);
            public TcgTempletQuery fileSuffixNotLike(String fileSuffixNotLike);
            public TcgTempletQuery fileSuffixIsNull();
            public TcgTempletQuery fileSuffixIsNotNull();












            public TcgTempletQuery templetTitle(String templetTitle);
            public TcgTempletQuery templetTitleNot(String templetTitleNot);
            public TcgTempletQuery templetTitleIn(String templetTitleIn);
            public TcgTempletQuery templetTitleNotIn(String templetTitleNotIn);
            public TcgTempletQuery templetTitleLike(String templetTitleLike);
            public TcgTempletQuery templetTitleNotLike(String templetTitleNotLike);
            public TcgTempletQuery templetTitleIsNull();
            public TcgTempletQuery templetTitleIsNotNull();












            public TcgTempletQuery isUi(String isUi);
            public TcgTempletQuery isUiNot(String isUiNot);
            public TcgTempletQuery isUiIn(String isUiIn);
            public TcgTempletQuery isUiNotIn(String isUiNotIn);
            public TcgTempletQuery isUiIsNull();
            public TcgTempletQuery isUiIsNotNull();













            public TcgTempletQuery templetContent(String templetContent);
            public TcgTempletQuery templetContentNot(String templetContentNot);
            public TcgTempletQuery templetContentIn(String templetContentIn);
            public TcgTempletQuery templetContentNotIn(String templetContentNotIn);
            public TcgTempletQuery templetContentLike(String templetContentLike);
            public TcgTempletQuery templetContentNotLike(String templetContentNotLike);
            public TcgTempletQuery templetContentIsNull();
            public TcgTempletQuery templetContentIsNotNull();












        public TcgTempletQuery createTime(Timestamp createTime);
        public TcgTempletQuery createTimeNot(Timestamp createTimeNot);
        public TcgTempletQuery createTimeGreaterThan(Timestamp createTimeGreaterThan);
        public TcgTempletQuery createTimeGreaterEqual(Timestamp createTimeGreaterEqual);
        public TcgTempletQuery createTimeLessThan(Timestamp createTimeLessThan);
        public TcgTempletQuery createTimeLessEqual(Timestamp createTimeLessEqual);










            public TcgTempletQuery createUserId(PK createUserId);
            public TcgTempletQuery createUserIdNot(PK createUserIdNot);
            public TcgTempletQuery createUserIdIn(PK createUserIdIn);
            public TcgTempletQuery createUserIdNotIn(PK createUserIdNotIn);
            public TcgTempletQuery createUserIdIsNull();
            public TcgTempletQuery createUserIdIsNotNull();












        public TcgTempletQuery updateTime(Timestamp updateTime);
        public TcgTempletQuery updateTimeNot(Timestamp updateTimeNot);
        public TcgTempletQuery updateTimeGreaterThan(Timestamp updateTimeGreaterThan);
        public TcgTempletQuery updateTimeGreaterEqual(Timestamp updateTimeGreaterEqual);
        public TcgTempletQuery updateTimeLessThan(Timestamp updateTimeLessThan);
        public TcgTempletQuery updateTimeLessEqual(Timestamp updateTimeLessEqual);










            public TcgTempletQuery updateUserId(PK updateUserId);
            public TcgTempletQuery updateUserIdNot(PK updateUserIdNot);
            public TcgTempletQuery updateUserIdIn(PK updateUserIdIn);
            public TcgTempletQuery updateUserIdNotIn(PK updateUserIdNotIn);
            public TcgTempletQuery updateUserIdIsNull();
            public TcgTempletQuery updateUserIdIsNotNull();












        public TcgTempletQuery versionNo(Integer versionNo);
        public TcgTempletQuery versionNoNot(Integer versionNoNot);
        public TcgTempletQuery versionNoGreaterThan(Integer versionNoGreaterThan);
        public TcgTempletQuery versionNoGreaterEqual(Integer versionNoGreaterEqual);
        public TcgTempletQuery versionNoLessThan(Integer versionNoLessThan);
        public TcgTempletQuery versionNoLessEqual(Integer versionNoLessEqual);










            public TcgTempletQuery deleteFlag(String deleteFlag);
            public TcgTempletQuery deleteFlagNot(String deleteFlagNot);
            public TcgTempletQuery deleteFlagIn(String deleteFlagIn);
            public TcgTempletQuery deleteFlagNotIn(String deleteFlagNotIn);
            public TcgTempletQuery deleteFlagIsNull();
            public TcgTempletQuery deleteFlagIsNotNull();









	
}