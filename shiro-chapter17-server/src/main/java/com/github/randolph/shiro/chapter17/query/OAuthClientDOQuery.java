package com.github.randolph.shiro.chapter17.query;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OAuthClientDOQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OAuthClientDOQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andKeyidIsNull() {
            addCriterion("KeyId is null");
            return (Criteria) this;
        }

        public Criteria andKeyidIsNotNull() {
            addCriterion("KeyId is not null");
            return (Criteria) this;
        }

        public Criteria andKeyidEqualTo(String value) {
            addCriterion("KeyId =", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotEqualTo(String value) {
            addCriterion("KeyId <>", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThan(String value) {
            addCriterion("KeyId >", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidGreaterThanOrEqualTo(String value) {
            addCriterion("KeyId >=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThan(String value) {
            addCriterion("KeyId <", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLessThanOrEqualTo(String value) {
            addCriterion("KeyId <=", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidLike(String value) {
            addCriterion("KeyId like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotLike(String value) {
            addCriterion("KeyId not like", value, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidIn(List<String> values) {
            addCriterion("KeyId in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotIn(List<String> values) {
            addCriterion("KeyId not in", values, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidBetween(String value1, String value2) {
            addCriterion("KeyId between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andKeyidNotBetween(String value1, String value2) {
            addCriterion("KeyId not between", value1, value2, "keyid");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNull() {
            addCriterion("ClientName is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("ClientName is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("ClientName =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("ClientName <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("ClientName >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("ClientName >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("ClientName <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("ClientName <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("ClientName like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("ClientName not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("ClientName in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("ClientName not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("ClientName between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("ClientName not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientkeyidIsNull() {
            addCriterion("ClientKeyId is null");
            return (Criteria) this;
        }

        public Criteria andClientkeyidIsNotNull() {
            addCriterion("ClientKeyId is not null");
            return (Criteria) this;
        }

        public Criteria andClientkeyidEqualTo(String value) {
            addCriterion("ClientKeyId =", value, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientkeyidNotEqualTo(String value) {
            addCriterion("ClientKeyId <>", value, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientkeyidGreaterThan(String value) {
            addCriterion("ClientKeyId >", value, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientkeyidGreaterThanOrEqualTo(String value) {
            addCriterion("ClientKeyId >=", value, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientkeyidLessThan(String value) {
            addCriterion("ClientKeyId <", value, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientkeyidLessThanOrEqualTo(String value) {
            addCriterion("ClientKeyId <=", value, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientkeyidLike(String value) {
            addCriterion("ClientKeyId like", value, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientkeyidNotLike(String value) {
            addCriterion("ClientKeyId not like", value, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientkeyidIn(List<String> values) {
            addCriterion("ClientKeyId in", values, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientkeyidNotIn(List<String> values) {
            addCriterion("ClientKeyId not in", values, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientkeyidBetween(String value1, String value2) {
            addCriterion("ClientKeyId between", value1, value2, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientkeyidNotBetween(String value1, String value2) {
            addCriterion("ClientKeyId not between", value1, value2, "clientkeyid");
            return (Criteria) this;
        }

        public Criteria andClientsecretIsNull() {
            addCriterion("ClientSecret is null");
            return (Criteria) this;
        }

        public Criteria andClientsecretIsNotNull() {
            addCriterion("ClientSecret is not null");
            return (Criteria) this;
        }

        public Criteria andClientsecretEqualTo(String value) {
            addCriterion("ClientSecret =", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretNotEqualTo(String value) {
            addCriterion("ClientSecret <>", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretGreaterThan(String value) {
            addCriterion("ClientSecret >", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretGreaterThanOrEqualTo(String value) {
            addCriterion("ClientSecret >=", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretLessThan(String value) {
            addCriterion("ClientSecret <", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretLessThanOrEqualTo(String value) {
            addCriterion("ClientSecret <=", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretLike(String value) {
            addCriterion("ClientSecret like", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretNotLike(String value) {
            addCriterion("ClientSecret not like", value, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretIn(List<String> values) {
            addCriterion("ClientSecret in", values, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretNotIn(List<String> values) {
            addCriterion("ClientSecret not in", values, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretBetween(String value1, String value2) {
            addCriterion("ClientSecret between", value1, value2, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andClientsecretNotBetween(String value1, String value2) {
            addCriterion("ClientSecret not between", value1, value2, "clientsecret");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("IsDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("IsDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Date value) {
            addCriterion("IsDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Date value) {
            addCriterion("IsDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Date value) {
            addCriterion("IsDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Date value) {
            addCriterion("IsDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Date value) {
            addCriterion("IsDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Date value) {
            addCriterion("IsDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Date> values) {
            addCriterion("IsDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Date> values) {
            addCriterion("IsDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Date value1, Date value2) {
            addCriterion("IsDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Date value1, Date value2) {
            addCriterion("IsDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}