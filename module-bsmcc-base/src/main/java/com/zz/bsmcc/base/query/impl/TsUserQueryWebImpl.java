package com.zz.bsmcc.base.query.impl;


import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 用户 用于装载用户在查询时提交的数据
 * 链式查询
 * @author Administrator
 * @date 2018-8-5 15:16:00
 */
public class TsUserQueryWebImpl<PK extends Serializable> extends TsUserAbstractQueryImpl<PK> implements Serializable {








            private PK id_IN;
            private PK id_NOTIN;










            private String userName_IN;
            private String userName_NOTIN;










            private String loginName_IN;
            private String loginName_NOTIN;










            private String loginPassword_IN;
            private String loginPassword_NOTIN;











            private PK salt_IN;
            private PK salt_NOTIN;











            private String status_IN;
            private String status_NOTIN;












            private PK leadId_IN;
            private PK leadId_NOTIN;










            private String phone_IN;
            private String phone_NOTIN;










            private String email_IN;
            private String email_NOTIN;










            private String avatarUrl_IN;
            private String avatarUrl_NOTIN;











            private PK openId_IN;
            private PK openId_NOTIN;











            private PK unionId_IN;
            private PK unionId_NOTIN;











            private String systemAdmin_IN;
            private String systemAdmin_NOTIN;












            private PK depId_IN;
            private PK depId_NOTIN;











            private PK organId_IN;
            private PK organId_NOTIN;










            private String remark_IN;
            private String remark_NOTIN;











            private String deleteFlag_IN;
            private String deleteFlag_NOTIN;












            private PK createUserId_IN;
            private PK createUserId_NOTIN;










            private String createUserName_IN;
            private String createUserName_NOTIN;








        ;










            private PK updateUserId_IN;
            private PK updateUserId_NOTIN;










            private String updateUserName_IN;
            private String updateUserName_NOTIN;








        ;







        ;










            private PK tenantId_IN;
            private PK tenantId_NOTIN;
























                public PK getId() {
                    return id;
                }


                public void setId(PK id) {
                    this.id = id;
                }


                public PK getId_NE() {
                return id_NE;
                }


                public void setId_NE(PK id_NE) {
                this.id_NE = id_NE;
                }








                public PK getId_IN() {
                    return id_IN;
                }

                public void setId_IN(PK id_IN) {
                    this.id_IN = id_IN;
                }

                public PK getId_NOTIN() {
                    return id_NOTIN;
                }

                public void setId_NOTIN(PK id_NOTIN) {
                    this.id_NOTIN = id_NOTIN;
                }


















                public String getUserName() {
                    return userName;
                }


                public void setUserName(String userName) {
                    this.userName = userName;
                }


                public String getUserName_NE() {
                    return userName_NE;
                }


                public void setUserName_NE(String userName_NE) {
                    this.userName_NE = userName_NE;
                }



                public String getUserName_IN() {
                    return userName_IN;
                }

                public void setUserName_IN(String userName_IN) {
                    this.userName_IN = userName_IN;
                }

                public String getUserName_NOTIN() {
                    return userName_NOTIN;
                }

                public void setUserName_NOTIN(String userName_NOTIN) {
                    this.userName_NOTIN = userName_NOTIN;
                }




                public String getUserName_LIKE() {
                    return userName_LIKE;
                }

                public void setUserName_LIKE(String userName_LIKE) {
                    this.userName_LIKE = userName_LIKE;
                }

                public String getUserName_NOTLIKE() {
                    return userName_NOTLIKE;
                }

                public void setUserName_NOTLIKE(String userName_NOTLIKE) {
                    this.userName_NOTLIKE = userName_NOTLIKE;
                }















                public String getLoginName() {
                    return loginName;
                }


                public void setLoginName(String loginName) {
                    this.loginName = loginName;
                }


                public String getLoginName_NE() {
                    return loginName_NE;
                }


                public void setLoginName_NE(String loginName_NE) {
                    this.loginName_NE = loginName_NE;
                }



                public String getLoginName_IN() {
                    return loginName_IN;
                }

                public void setLoginName_IN(String loginName_IN) {
                    this.loginName_IN = loginName_IN;
                }

                public String getLoginName_NOTIN() {
                    return loginName_NOTIN;
                }

                public void setLoginName_NOTIN(String loginName_NOTIN) {
                    this.loginName_NOTIN = loginName_NOTIN;
                }




                public String getLoginName_LIKE() {
                    return loginName_LIKE;
                }

                public void setLoginName_LIKE(String loginName_LIKE) {
                    this.loginName_LIKE = loginName_LIKE;
                }

                public String getLoginName_NOTLIKE() {
                    return loginName_NOTLIKE;
                }

                public void setLoginName_NOTLIKE(String loginName_NOTLIKE) {
                    this.loginName_NOTLIKE = loginName_NOTLIKE;
                }















                public String getLoginPassword() {
                    return loginPassword;
                }


                public void setLoginPassword(String loginPassword) {
                    this.loginPassword = loginPassword;
                }


                public String getLoginPassword_NE() {
                    return loginPassword_NE;
                }


                public void setLoginPassword_NE(String loginPassword_NE) {
                    this.loginPassword_NE = loginPassword_NE;
                }



                public String getLoginPassword_IN() {
                    return loginPassword_IN;
                }

                public void setLoginPassword_IN(String loginPassword_IN) {
                    this.loginPassword_IN = loginPassword_IN;
                }

                public String getLoginPassword_NOTIN() {
                    return loginPassword_NOTIN;
                }

                public void setLoginPassword_NOTIN(String loginPassword_NOTIN) {
                    this.loginPassword_NOTIN = loginPassword_NOTIN;
                }




                public String getLoginPassword_LIKE() {
                    return loginPassword_LIKE;
                }

                public void setLoginPassword_LIKE(String loginPassword_LIKE) {
                    this.loginPassword_LIKE = loginPassword_LIKE;
                }

                public String getLoginPassword_NOTLIKE() {
                    return loginPassword_NOTLIKE;
                }

                public void setLoginPassword_NOTLIKE(String loginPassword_NOTLIKE) {
                    this.loginPassword_NOTLIKE = loginPassword_NOTLIKE;
                }















                public PK getSalt() {
                    return salt;
                }


                public void setSalt(PK salt) {
                    this.salt = salt;
                }


                public PK getSalt_NE() {
                return salt_NE;
                }


                public void setSalt_NE(PK salt_NE) {
                this.salt_NE = salt_NE;
                }








                public PK getSalt_IN() {
                    return salt_IN;
                }

                public void setSalt_IN(PK salt_IN) {
                    this.salt_IN = salt_IN;
                }

                public PK getSalt_NOTIN() {
                    return salt_NOTIN;
                }

                public void setSalt_NOTIN(PK salt_NOTIN) {
                    this.salt_NOTIN = salt_NOTIN;
                }


















                public String getStatus() {
                    return status;
                }


                public void setStatus(String status) {
                    this.status = status;
                }


                public String getStatus_NE() {
                    return status_NE;
                }


                public void setStatus_NE(String status_NE) {
                    this.status_NE = status_NE;
                }



                public String getStatus_IN() {
                    return status_IN;
                }

                public void setStatus_IN(String status_IN) {
                    this.status_IN = status_IN;
                }

                public String getStatus_NOTIN() {
                    return status_NOTIN;
                }

                public void setStatus_NOTIN(String status_NOTIN) {
                    this.status_NOTIN = status_NOTIN;
                }
















                public PK getLeadId() {
                    return leadId;
                }


                public void setLeadId(PK leadId) {
                    this.leadId = leadId;
                }


                public PK getLeadId_NE() {
                return leadId_NE;
                }


                public void setLeadId_NE(PK leadId_NE) {
                this.leadId_NE = leadId_NE;
                }








                public PK getLeadId_IN() {
                    return leadId_IN;
                }

                public void setLeadId_IN(PK leadId_IN) {
                    this.leadId_IN = leadId_IN;
                }

                public PK getLeadId_NOTIN() {
                    return leadId_NOTIN;
                }

                public void setLeadId_NOTIN(PK leadId_NOTIN) {
                    this.leadId_NOTIN = leadId_NOTIN;
                }


















                public String getPhone() {
                    return phone;
                }


                public void setPhone(String phone) {
                    this.phone = phone;
                }


                public String getPhone_NE() {
                    return phone_NE;
                }


                public void setPhone_NE(String phone_NE) {
                    this.phone_NE = phone_NE;
                }



                public String getPhone_IN() {
                    return phone_IN;
                }

                public void setPhone_IN(String phone_IN) {
                    this.phone_IN = phone_IN;
                }

                public String getPhone_NOTIN() {
                    return phone_NOTIN;
                }

                public void setPhone_NOTIN(String phone_NOTIN) {
                    this.phone_NOTIN = phone_NOTIN;
                }




                public String getPhone_LIKE() {
                    return phone_LIKE;
                }

                public void setPhone_LIKE(String phone_LIKE) {
                    this.phone_LIKE = phone_LIKE;
                }

                public String getPhone_NOTLIKE() {
                    return phone_NOTLIKE;
                }

                public void setPhone_NOTLIKE(String phone_NOTLIKE) {
                    this.phone_NOTLIKE = phone_NOTLIKE;
                }















                public String getEmail() {
                    return email;
                }


                public void setEmail(String email) {
                    this.email = email;
                }


                public String getEmail_NE() {
                    return email_NE;
                }


                public void setEmail_NE(String email_NE) {
                    this.email_NE = email_NE;
                }



                public String getEmail_IN() {
                    return email_IN;
                }

                public void setEmail_IN(String email_IN) {
                    this.email_IN = email_IN;
                }

                public String getEmail_NOTIN() {
                    return email_NOTIN;
                }

                public void setEmail_NOTIN(String email_NOTIN) {
                    this.email_NOTIN = email_NOTIN;
                }




                public String getEmail_LIKE() {
                    return email_LIKE;
                }

                public void setEmail_LIKE(String email_LIKE) {
                    this.email_LIKE = email_LIKE;
                }

                public String getEmail_NOTLIKE() {
                    return email_NOTLIKE;
                }

                public void setEmail_NOTLIKE(String email_NOTLIKE) {
                    this.email_NOTLIKE = email_NOTLIKE;
                }















                public String getAvatarUrl() {
                    return avatarUrl;
                }


                public void setAvatarUrl(String avatarUrl) {
                    this.avatarUrl = avatarUrl;
                }


                public String getAvatarUrl_NE() {
                    return avatarUrl_NE;
                }


                public void setAvatarUrl_NE(String avatarUrl_NE) {
                    this.avatarUrl_NE = avatarUrl_NE;
                }



                public String getAvatarUrl_IN() {
                    return avatarUrl_IN;
                }

                public void setAvatarUrl_IN(String avatarUrl_IN) {
                    this.avatarUrl_IN = avatarUrl_IN;
                }

                public String getAvatarUrl_NOTIN() {
                    return avatarUrl_NOTIN;
                }

                public void setAvatarUrl_NOTIN(String avatarUrl_NOTIN) {
                    this.avatarUrl_NOTIN = avatarUrl_NOTIN;
                }




                public String getAvatarUrl_LIKE() {
                    return avatarUrl_LIKE;
                }

                public void setAvatarUrl_LIKE(String avatarUrl_LIKE) {
                    this.avatarUrl_LIKE = avatarUrl_LIKE;
                }

                public String getAvatarUrl_NOTLIKE() {
                    return avatarUrl_NOTLIKE;
                }

                public void setAvatarUrl_NOTLIKE(String avatarUrl_NOTLIKE) {
                    this.avatarUrl_NOTLIKE = avatarUrl_NOTLIKE;
                }















                public PK getOpenId() {
                    return openId;
                }


                public void setOpenId(PK openId) {
                    this.openId = openId;
                }


                public PK getOpenId_NE() {
                return openId_NE;
                }


                public void setOpenId_NE(PK openId_NE) {
                this.openId_NE = openId_NE;
                }








                public PK getOpenId_IN() {
                    return openId_IN;
                }

                public void setOpenId_IN(PK openId_IN) {
                    this.openId_IN = openId_IN;
                }

                public PK getOpenId_NOTIN() {
                    return openId_NOTIN;
                }

                public void setOpenId_NOTIN(PK openId_NOTIN) {
                    this.openId_NOTIN = openId_NOTIN;
                }


















                public PK getUnionId() {
                    return unionId;
                }


                public void setUnionId(PK unionId) {
                    this.unionId = unionId;
                }


                public PK getUnionId_NE() {
                return unionId_NE;
                }


                public void setUnionId_NE(PK unionId_NE) {
                this.unionId_NE = unionId_NE;
                }








                public PK getUnionId_IN() {
                    return unionId_IN;
                }

                public void setUnionId_IN(PK unionId_IN) {
                    this.unionId_IN = unionId_IN;
                }

                public PK getUnionId_NOTIN() {
                    return unionId_NOTIN;
                }

                public void setUnionId_NOTIN(PK unionId_NOTIN) {
                    this.unionId_NOTIN = unionId_NOTIN;
                }


















                public String getSystemAdmin() {
                    return systemAdmin;
                }


                public void setSystemAdmin(String systemAdmin) {
                    this.systemAdmin = systemAdmin;
                }


                public String getSystemAdmin_NE() {
                    return systemAdmin_NE;
                }


                public void setSystemAdmin_NE(String systemAdmin_NE) {
                    this.systemAdmin_NE = systemAdmin_NE;
                }



                public String getSystemAdmin_IN() {
                    return systemAdmin_IN;
                }

                public void setSystemAdmin_IN(String systemAdmin_IN) {
                    this.systemAdmin_IN = systemAdmin_IN;
                }

                public String getSystemAdmin_NOTIN() {
                    return systemAdmin_NOTIN;
                }

                public void setSystemAdmin_NOTIN(String systemAdmin_NOTIN) {
                    this.systemAdmin_NOTIN = systemAdmin_NOTIN;
                }
















                public PK getDepId() {
                    return depId;
                }


                public void setDepId(PK depId) {
                    this.depId = depId;
                }


                public PK getDepId_NE() {
                return depId_NE;
                }


                public void setDepId_NE(PK depId_NE) {
                this.depId_NE = depId_NE;
                }








                public PK getDepId_IN() {
                    return depId_IN;
                }

                public void setDepId_IN(PK depId_IN) {
                    this.depId_IN = depId_IN;
                }

                public PK getDepId_NOTIN() {
                    return depId_NOTIN;
                }

                public void setDepId_NOTIN(PK depId_NOTIN) {
                    this.depId_NOTIN = depId_NOTIN;
                }


















                public PK getOrganId() {
                    return organId;
                }


                public void setOrganId(PK organId) {
                    this.organId = organId;
                }


                public PK getOrganId_NE() {
                return organId_NE;
                }


                public void setOrganId_NE(PK organId_NE) {
                this.organId_NE = organId_NE;
                }








                public PK getOrganId_IN() {
                    return organId_IN;
                }

                public void setOrganId_IN(PK organId_IN) {
                    this.organId_IN = organId_IN;
                }

                public PK getOrganId_NOTIN() {
                    return organId_NOTIN;
                }

                public void setOrganId_NOTIN(PK organId_NOTIN) {
                    this.organId_NOTIN = organId_NOTIN;
                }


















                public String getRemark() {
                    return remark;
                }


                public void setRemark(String remark) {
                    this.remark = remark;
                }


                public String getRemark_NE() {
                    return remark_NE;
                }


                public void setRemark_NE(String remark_NE) {
                    this.remark_NE = remark_NE;
                }



                public String getRemark_IN() {
                    return remark_IN;
                }

                public void setRemark_IN(String remark_IN) {
                    this.remark_IN = remark_IN;
                }

                public String getRemark_NOTIN() {
                    return remark_NOTIN;
                }

                public void setRemark_NOTIN(String remark_NOTIN) {
                    this.remark_NOTIN = remark_NOTIN;
                }




                public String getRemark_LIKE() {
                    return remark_LIKE;
                }

                public void setRemark_LIKE(String remark_LIKE) {
                    this.remark_LIKE = remark_LIKE;
                }

                public String getRemark_NOTLIKE() {
                    return remark_NOTLIKE;
                }

                public void setRemark_NOTLIKE(String remark_NOTLIKE) {
                    this.remark_NOTLIKE = remark_NOTLIKE;
                }















                public String getDeleteFlag() {
                    return deleteFlag;
                }


                public void setDeleteFlag(String deleteFlag) {
                    this.deleteFlag = deleteFlag;
                }


                public String getDeleteFlag_NE() {
                    return deleteFlag_NE;
                }


                public void setDeleteFlag_NE(String deleteFlag_NE) {
                    this.deleteFlag_NE = deleteFlag_NE;
                }



                public String getDeleteFlag_IN() {
                    return deleteFlag_IN;
                }

                public void setDeleteFlag_IN(String deleteFlag_IN) {
                    this.deleteFlag_IN = deleteFlag_IN;
                }

                public String getDeleteFlag_NOTIN() {
                    return deleteFlag_NOTIN;
                }

                public void setDeleteFlag_NOTIN(String deleteFlag_NOTIN) {
                    this.deleteFlag_NOTIN = deleteFlag_NOTIN;
                }
















                public PK getCreateUserId() {
                    return createUserId;
                }


                public void setCreateUserId(PK createUserId) {
                    this.createUserId = createUserId;
                }


                public PK getCreateUserId_NE() {
                return createUserId_NE;
                }


                public void setCreateUserId_NE(PK createUserId_NE) {
                this.createUserId_NE = createUserId_NE;
                }








                public PK getCreateUserId_IN() {
                    return createUserId_IN;
                }

                public void setCreateUserId_IN(PK createUserId_IN) {
                    this.createUserId_IN = createUserId_IN;
                }

                public PK getCreateUserId_NOTIN() {
                    return createUserId_NOTIN;
                }

                public void setCreateUserId_NOTIN(PK createUserId_NOTIN) {
                    this.createUserId_NOTIN = createUserId_NOTIN;
                }


















                public String getCreateUserName() {
                    return createUserName;
                }


                public void setCreateUserName(String createUserName) {
                    this.createUserName = createUserName;
                }


                public String getCreateUserName_NE() {
                    return createUserName_NE;
                }


                public void setCreateUserName_NE(String createUserName_NE) {
                    this.createUserName_NE = createUserName_NE;
                }



                public String getCreateUserName_IN() {
                    return createUserName_IN;
                }

                public void setCreateUserName_IN(String createUserName_IN) {
                    this.createUserName_IN = createUserName_IN;
                }

                public String getCreateUserName_NOTIN() {
                    return createUserName_NOTIN;
                }

                public void setCreateUserName_NOTIN(String createUserName_NOTIN) {
                    this.createUserName_NOTIN = createUserName_NOTIN;
                }




                public String getCreateUserName_LIKE() {
                    return createUserName_LIKE;
                }

                public void setCreateUserName_LIKE(String createUserName_LIKE) {
                    this.createUserName_LIKE = createUserName_LIKE;
                }

                public String getCreateUserName_NOTLIKE() {
                    return createUserName_NOTLIKE;
                }

                public void setCreateUserName_NOTLIKE(String createUserName_NOTLIKE) {
                    this.createUserName_NOTLIKE = createUserName_NOTLIKE;
                }













            public Timestamp getCreateTime() {
                return createTime;
            }


            public void setCreateTime(Timestamp createTime) {
                this.createTime = createTime;
            }


            public Timestamp getCreateTime_NE() {
                return createTime_NE;
            }


            public void setCreateTime_NE(Timestamp createTime_NE) {
                this.createTime_NE = createTime_NE;
            }



            public Timestamp getCreateTime_GT() {
                return createTime_GT;
            }


            public void setCreateTime_GT(Timestamp createTime_GT) {
                this.createTime_GT = createTime_GT;
            }


            public Timestamp getCreateTime_GE() {
                return createTime_GE;
            }


            public void setCreateTime_GE(Timestamp createTime_GE) {
                this.createTime_GE = createTime_GE;
            }




            public Timestamp getCreateTime_LT() {
                return createTime_LT;
            }


            public void setCreateTime_LT(Timestamp createTime_LT) {
                this.createTime_LT = createTime_LT;
            }


            public Timestamp getCreateTime_LE() {
                return createTime_LE;
            }


            public void setCreateTime_LE(Timestamp createTime_LE) {
                this.createTime_LE = createTime_LE;
            }













                public PK getUpdateUserId() {
                    return updateUserId;
                }


                public void setUpdateUserId(PK updateUserId) {
                    this.updateUserId = updateUserId;
                }


                public PK getUpdateUserId_NE() {
                return updateUserId_NE;
                }


                public void setUpdateUserId_NE(PK updateUserId_NE) {
                this.updateUserId_NE = updateUserId_NE;
                }








                public PK getUpdateUserId_IN() {
                    return updateUserId_IN;
                }

                public void setUpdateUserId_IN(PK updateUserId_IN) {
                    this.updateUserId_IN = updateUserId_IN;
                }

                public PK getUpdateUserId_NOTIN() {
                    return updateUserId_NOTIN;
                }

                public void setUpdateUserId_NOTIN(PK updateUserId_NOTIN) {
                    this.updateUserId_NOTIN = updateUserId_NOTIN;
                }


















                public String getUpdateUserName() {
                    return updateUserName;
                }


                public void setUpdateUserName(String updateUserName) {
                    this.updateUserName = updateUserName;
                }


                public String getUpdateUserName_NE() {
                    return updateUserName_NE;
                }


                public void setUpdateUserName_NE(String updateUserName_NE) {
                    this.updateUserName_NE = updateUserName_NE;
                }



                public String getUpdateUserName_IN() {
                    return updateUserName_IN;
                }

                public void setUpdateUserName_IN(String updateUserName_IN) {
                    this.updateUserName_IN = updateUserName_IN;
                }

                public String getUpdateUserName_NOTIN() {
                    return updateUserName_NOTIN;
                }

                public void setUpdateUserName_NOTIN(String updateUserName_NOTIN) {
                    this.updateUserName_NOTIN = updateUserName_NOTIN;
                }




                public String getUpdateUserName_LIKE() {
                    return updateUserName_LIKE;
                }

                public void setUpdateUserName_LIKE(String updateUserName_LIKE) {
                    this.updateUserName_LIKE = updateUserName_LIKE;
                }

                public String getUpdateUserName_NOTLIKE() {
                    return updateUserName_NOTLIKE;
                }

                public void setUpdateUserName_NOTLIKE(String updateUserName_NOTLIKE) {
                    this.updateUserName_NOTLIKE = updateUserName_NOTLIKE;
                }













            public Timestamp getUpdateTime() {
                return updateTime;
            }


            public void setUpdateTime(Timestamp updateTime) {
                this.updateTime = updateTime;
            }


            public Timestamp getUpdateTime_NE() {
                return updateTime_NE;
            }


            public void setUpdateTime_NE(Timestamp updateTime_NE) {
                this.updateTime_NE = updateTime_NE;
            }



            public Timestamp getUpdateTime_GT() {
                return updateTime_GT;
            }


            public void setUpdateTime_GT(Timestamp updateTime_GT) {
                this.updateTime_GT = updateTime_GT;
            }


            public Timestamp getUpdateTime_GE() {
                return updateTime_GE;
            }


            public void setUpdateTime_GE(Timestamp updateTime_GE) {
                this.updateTime_GE = updateTime_GE;
            }




            public Timestamp getUpdateTime_LT() {
                return updateTime_LT;
            }


            public void setUpdateTime_LT(Timestamp updateTime_LT) {
                this.updateTime_LT = updateTime_LT;
            }


            public Timestamp getUpdateTime_LE() {
                return updateTime_LE;
            }


            public void setUpdateTime_LE(Timestamp updateTime_LE) {
                this.updateTime_LE = updateTime_LE;
            }










            public Integer getVersionNo() {
                return versionNo;
            }


            public void setVersionNo(Integer versionNo) {
                this.versionNo = versionNo;
            }


            public Integer getVersionNo_NE() {
                return versionNo_NE;
            }


            public void setVersionNo_NE(Integer versionNo_NE) {
                this.versionNo_NE = versionNo_NE;
            }



            public Integer getVersionNo_GT() {
                return versionNo_GT;
            }


            public void setVersionNo_GT(Integer versionNo_GT) {
                this.versionNo_GT = versionNo_GT;
            }


            public Integer getVersionNo_GE() {
                return versionNo_GE;
            }


            public void setVersionNo_GE(Integer versionNo_GE) {
                this.versionNo_GE = versionNo_GE;
            }




            public Integer getVersionNo_LT() {
                return versionNo_LT;
            }


            public void setVersionNo_LT(Integer versionNo_LT) {
                this.versionNo_LT = versionNo_LT;
            }


            public Integer getVersionNo_LE() {
                return versionNo_LE;
            }


            public void setVersionNo_LE(Integer versionNo_LE) {
                this.versionNo_LE = versionNo_LE;
            }















                public PK getTenantId() {
                    return tenantId;
                }


                public void setTenantId(PK tenantId) {
                    this.tenantId = tenantId;
                }


                public PK getTenantId_NE() {
                return tenantId_NE;
                }


                public void setTenantId_NE(PK tenantId_NE) {
                this.tenantId_NE = tenantId_NE;
                }








                public PK getTenantId_IN() {
                    return tenantId_IN;
                }

                public void setTenantId_IN(PK tenantId_IN) {
                    this.tenantId_IN = tenantId_IN;
                }

                public PK getTenantId_NOTIN() {
                    return tenantId_NOTIN;
                }

                public void setTenantId_NOTIN(PK tenantId_NOTIN) {
                    this.tenantId_NOTIN = tenantId_NOTIN;
                }










	
}