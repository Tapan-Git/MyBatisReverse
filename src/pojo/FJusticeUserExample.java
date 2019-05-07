package pojo;

import java.util.ArrayList;
import java.util.List;

public class FJusticeUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FJusticeUserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("userPassWord is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userPassWord is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userPassWord =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userPassWord <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userPassWord >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userPassWord >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userPassWord <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userPassWord <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userPassWord like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userPassWord not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userPassWord in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userPassWord not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userPassWord between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userPassWord not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUsertimeIsNull() {
            addCriterion("userTime is null");
            return (Criteria) this;
        }

        public Criteria andUsertimeIsNotNull() {
            addCriterion("userTime is not null");
            return (Criteria) this;
        }

        public Criteria andUsertimeEqualTo(String value) {
            addCriterion("userTime =", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeNotEqualTo(String value) {
            addCriterion("userTime <>", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeGreaterThan(String value) {
            addCriterion("userTime >", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeGreaterThanOrEqualTo(String value) {
            addCriterion("userTime >=", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeLessThan(String value) {
            addCriterion("userTime <", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeLessThanOrEqualTo(String value) {
            addCriterion("userTime <=", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeLike(String value) {
            addCriterion("userTime like", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeNotLike(String value) {
            addCriterion("userTime not like", value, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeIn(List<String> values) {
            addCriterion("userTime in", values, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeNotIn(List<String> values) {
            addCriterion("userTime not in", values, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeBetween(String value1, String value2) {
            addCriterion("userTime between", value1, value2, "usertime");
            return (Criteria) this;
        }

        public Criteria andUsertimeNotBetween(String value1, String value2) {
            addCriterion("userTime not between", value1, value2, "usertime");
            return (Criteria) this;
        }

        public Criteria andUseridentityIsNull() {
            addCriterion("userIdentity is null");
            return (Criteria) this;
        }

        public Criteria andUseridentityIsNotNull() {
            addCriterion("userIdentity is not null");
            return (Criteria) this;
        }

        public Criteria andUseridentityEqualTo(String value) {
            addCriterion("userIdentity =", value, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUseridentityNotEqualTo(String value) {
            addCriterion("userIdentity <>", value, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUseridentityGreaterThan(String value) {
            addCriterion("userIdentity >", value, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUseridentityGreaterThanOrEqualTo(String value) {
            addCriterion("userIdentity >=", value, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUseridentityLessThan(String value) {
            addCriterion("userIdentity <", value, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUseridentityLessThanOrEqualTo(String value) {
            addCriterion("userIdentity <=", value, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUseridentityLike(String value) {
            addCriterion("userIdentity like", value, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUseridentityNotLike(String value) {
            addCriterion("userIdentity not like", value, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUseridentityIn(List<String> values) {
            addCriterion("userIdentity in", values, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUseridentityNotIn(List<String> values) {
            addCriterion("userIdentity not in", values, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUseridentityBetween(String value1, String value2) {
            addCriterion("userIdentity between", value1, value2, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUseridentityNotBetween(String value1, String value2) {
            addCriterion("userIdentity not between", value1, value2, "useridentity");
            return (Criteria) this;
        }

        public Criteria andUserdateIsNull() {
            addCriterion("userDate is null");
            return (Criteria) this;
        }

        public Criteria andUserdateIsNotNull() {
            addCriterion("userDate is not null");
            return (Criteria) this;
        }

        public Criteria andUserdateEqualTo(String value) {
            addCriterion("userDate =", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateNotEqualTo(String value) {
            addCriterion("userDate <>", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateGreaterThan(String value) {
            addCriterion("userDate >", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateGreaterThanOrEqualTo(String value) {
            addCriterion("userDate >=", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateLessThan(String value) {
            addCriterion("userDate <", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateLessThanOrEqualTo(String value) {
            addCriterion("userDate <=", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateLike(String value) {
            addCriterion("userDate like", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateNotLike(String value) {
            addCriterion("userDate not like", value, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateIn(List<String> values) {
            addCriterion("userDate in", values, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateNotIn(List<String> values) {
            addCriterion("userDate not in", values, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateBetween(String value1, String value2) {
            addCriterion("userDate between", value1, value2, "userdate");
            return (Criteria) this;
        }

        public Criteria andUserdateNotBetween(String value1, String value2) {
            addCriterion("userDate not between", value1, value2, "userdate");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("userEmail is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("userEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("userEmail =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("userEmail <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("userEmail >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("userEmail >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("userEmail <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("userEmail <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("userEmail like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("userEmail not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("userEmail in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("userEmail not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("userEmail between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("userEmail not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUsernumberIsNull() {
            addCriterion("userNumber is null");
            return (Criteria) this;
        }

        public Criteria andUsernumberIsNotNull() {
            addCriterion("userNumber is not null");
            return (Criteria) this;
        }

        public Criteria andUsernumberEqualTo(String value) {
            addCriterion("userNumber =", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotEqualTo(String value) {
            addCriterion("userNumber <>", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThan(String value) {
            addCriterion("userNumber >", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThanOrEqualTo(String value) {
            addCriterion("userNumber >=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThan(String value) {
            addCriterion("userNumber <", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThanOrEqualTo(String value) {
            addCriterion("userNumber <=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLike(String value) {
            addCriterion("userNumber like", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotLike(String value) {
            addCriterion("userNumber not like", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberIn(List<String> values) {
            addCriterion("userNumber in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotIn(List<String> values) {
            addCriterion("userNumber not in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberBetween(String value1, String value2) {
            addCriterion("userNumber between", value1, value2, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotBetween(String value1, String value2) {
            addCriterion("userNumber not between", value1, value2, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUserrecordIsNull() {
            addCriterion("userRecord is null");
            return (Criteria) this;
        }

        public Criteria andUserrecordIsNotNull() {
            addCriterion("userRecord is not null");
            return (Criteria) this;
        }

        public Criteria andUserrecordEqualTo(String value) {
            addCriterion("userRecord =", value, "userrecord");
            return (Criteria) this;
        }

        public Criteria andUserrecordNotEqualTo(String value) {
            addCriterion("userRecord <>", value, "userrecord");
            return (Criteria) this;
        }

        public Criteria andUserrecordGreaterThan(String value) {
            addCriterion("userRecord >", value, "userrecord");
            return (Criteria) this;
        }

        public Criteria andUserrecordGreaterThanOrEqualTo(String value) {
            addCriterion("userRecord >=", value, "userrecord");
            return (Criteria) this;
        }

        public Criteria andUserrecordLessThan(String value) {
            addCriterion("userRecord <", value, "userrecord");
            return (Criteria) this;
        }

        public Criteria andUserrecordLessThanOrEqualTo(String value) {
            addCriterion("userRecord <=", value, "userrecord");
            return (Criteria) this;
        }

        public Criteria andUserrecordLike(String value) {
            addCriterion("userRecord like", value, "userrecord");
            return (Criteria) this;
        }

        public Criteria andUserrecordNotLike(String value) {
            addCriterion("userRecord not like", value, "userrecord");
            return (Criteria) this;
        }

        public Criteria andUserrecordIn(List<String> values) {
            addCriterion("userRecord in", values, "userrecord");
            return (Criteria) this;
        }

        public Criteria andUserrecordNotIn(List<String> values) {
            addCriterion("userRecord not in", values, "userrecord");
            return (Criteria) this;
        }

        public Criteria andUserrecordBetween(String value1, String value2) {
            addCriterion("userRecord between", value1, value2, "userrecord");
            return (Criteria) this;
        }

        public Criteria andUserrecordNotBetween(String value1, String value2) {
            addCriterion("userRecord not between", value1, value2, "userrecord");
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