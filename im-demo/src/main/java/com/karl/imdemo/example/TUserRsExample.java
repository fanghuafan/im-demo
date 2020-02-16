package com.karl.imdemo.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserRsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserRsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReqUserIdIsNull() {
            addCriterion("req_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReqUserIdIsNotNull() {
            addCriterion("req_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReqUserIdEqualTo(Integer value) {
            addCriterion("req_user_id =", value, "reqUserId");
            return (Criteria) this;
        }

        public Criteria andReqUserIdNotEqualTo(Integer value) {
            addCriterion("req_user_id <>", value, "reqUserId");
            return (Criteria) this;
        }

        public Criteria andReqUserIdGreaterThan(Integer value) {
            addCriterion("req_user_id >", value, "reqUserId");
            return (Criteria) this;
        }

        public Criteria andReqUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("req_user_id >=", value, "reqUserId");
            return (Criteria) this;
        }

        public Criteria andReqUserIdLessThan(Integer value) {
            addCriterion("req_user_id <", value, "reqUserId");
            return (Criteria) this;
        }

        public Criteria andReqUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("req_user_id <=", value, "reqUserId");
            return (Criteria) this;
        }

        public Criteria andReqUserIdIn(List<Integer> values) {
            addCriterion("req_user_id in", values, "reqUserId");
            return (Criteria) this;
        }

        public Criteria andReqUserIdNotIn(List<Integer> values) {
            addCriterion("req_user_id not in", values, "reqUserId");
            return (Criteria) this;
        }

        public Criteria andReqUserIdBetween(Integer value1, Integer value2) {
            addCriterion("req_user_id between", value1, value2, "reqUserId");
            return (Criteria) this;
        }

        public Criteria andReqUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("req_user_id not between", value1, value2, "reqUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdIsNull() {
            addCriterion("f_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFUserIdIsNotNull() {
            addCriterion("f_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFUserIdEqualTo(Integer value) {
            addCriterion("f_user_id =", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdNotEqualTo(Integer value) {
            addCriterion("f_user_id <>", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdGreaterThan(Integer value) {
            addCriterion("f_user_id >", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_user_id >=", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdLessThan(Integer value) {
            addCriterion("f_user_id <", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_user_id <=", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdIn(List<Integer> values) {
            addCriterion("f_user_id in", values, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdNotIn(List<Integer> values) {
            addCriterion("f_user_id not in", values, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdBetween(Integer value1, Integer value2) {
            addCriterion("f_user_id between", value1, value2, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_user_id not between", value1, value2, "fUserId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andFUserRscolIsNull() {
            addCriterion("f_user_rscol is null");
            return (Criteria) this;
        }

        public Criteria andFUserRscolIsNotNull() {
            addCriterion("f_user_rscol is not null");
            return (Criteria) this;
        }

        public Criteria andFUserRscolEqualTo(String value) {
            addCriterion("f_user_rscol =", value, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andFUserRscolNotEqualTo(String value) {
            addCriterion("f_user_rscol <>", value, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andFUserRscolGreaterThan(String value) {
            addCriterion("f_user_rscol >", value, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andFUserRscolGreaterThanOrEqualTo(String value) {
            addCriterion("f_user_rscol >=", value, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andFUserRscolLessThan(String value) {
            addCriterion("f_user_rscol <", value, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andFUserRscolLessThanOrEqualTo(String value) {
            addCriterion("f_user_rscol <=", value, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andFUserRscolLike(String value) {
            addCriterion("f_user_rscol like", value, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andFUserRscolNotLike(String value) {
            addCriterion("f_user_rscol not like", value, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andFUserRscolIn(List<String> values) {
            addCriterion("f_user_rscol in", values, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andFUserRscolNotIn(List<String> values) {
            addCriterion("f_user_rscol not in", values, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andFUserRscolBetween(String value1, String value2) {
            addCriterion("f_user_rscol between", value1, value2, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andFUserRscolNotBetween(String value1, String value2) {
            addCriterion("f_user_rscol not between", value1, value2, "fUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolIsNull() {
            addCriterion("t_user_rscol is null");
            return (Criteria) this;
        }

        public Criteria andTUserRscolIsNotNull() {
            addCriterion("t_user_rscol is not null");
            return (Criteria) this;
        }

        public Criteria andTUserRscolEqualTo(String value) {
            addCriterion("t_user_rscol =", value, "tUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolNotEqualTo(String value) {
            addCriterion("t_user_rscol <>", value, "tUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolGreaterThan(String value) {
            addCriterion("t_user_rscol >", value, "tUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolGreaterThanOrEqualTo(String value) {
            addCriterion("t_user_rscol >=", value, "tUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolLessThan(String value) {
            addCriterion("t_user_rscol <", value, "tUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolLessThanOrEqualTo(String value) {
            addCriterion("t_user_rscol <=", value, "tUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolLike(String value) {
            addCriterion("t_user_rscol like", value, "tUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolNotLike(String value) {
            addCriterion("t_user_rscol not like", value, "tUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolIn(List<String> values) {
            addCriterion("t_user_rscol in", values, "tUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolNotIn(List<String> values) {
            addCriterion("t_user_rscol not in", values, "tUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolBetween(String value1, String value2) {
            addCriterion("t_user_rscol between", value1, value2, "tUserRscol");
            return (Criteria) this;
        }

        public Criteria andTUserRscolNotBetween(String value1, String value2) {
            addCriterion("t_user_rscol not between", value1, value2, "tUserRscol");
            return (Criteria) this;
        }
    }

    /**
     */
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