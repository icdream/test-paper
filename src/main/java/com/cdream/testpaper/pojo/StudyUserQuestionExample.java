package com.cdream.testpaper.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudyUserQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyUserQuestionExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andWrongTimesIsNull() {
            addCriterion("wrong_times is null");
            return (Criteria) this;
        }

        public Criteria andWrongTimesIsNotNull() {
            addCriterion("wrong_times is not null");
            return (Criteria) this;
        }

        public Criteria andWrongTimesEqualTo(Integer value) {
            addCriterion("wrong_times =", value, "wrongTimes");
            return (Criteria) this;
        }

        public Criteria andWrongTimesNotEqualTo(Integer value) {
            addCriterion("wrong_times <>", value, "wrongTimes");
            return (Criteria) this;
        }

        public Criteria andWrongTimesGreaterThan(Integer value) {
            addCriterion("wrong_times >", value, "wrongTimes");
            return (Criteria) this;
        }

        public Criteria andWrongTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("wrong_times >=", value, "wrongTimes");
            return (Criteria) this;
        }

        public Criteria andWrongTimesLessThan(Integer value) {
            addCriterion("wrong_times <", value, "wrongTimes");
            return (Criteria) this;
        }

        public Criteria andWrongTimesLessThanOrEqualTo(Integer value) {
            addCriterion("wrong_times <=", value, "wrongTimes");
            return (Criteria) this;
        }

        public Criteria andWrongTimesIn(List<Integer> values) {
            addCriterion("wrong_times in", values, "wrongTimes");
            return (Criteria) this;
        }

        public Criteria andWrongTimesNotIn(List<Integer> values) {
            addCriterion("wrong_times not in", values, "wrongTimes");
            return (Criteria) this;
        }

        public Criteria andWrongTimesBetween(Integer value1, Integer value2) {
            addCriterion("wrong_times between", value1, value2, "wrongTimes");
            return (Criteria) this;
        }

        public Criteria andWrongTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("wrong_times not between", value1, value2, "wrongTimes");
            return (Criteria) this;
        }

        public Criteria andMeetTimesIsNull() {
            addCriterion("meet_times is null");
            return (Criteria) this;
        }

        public Criteria andMeetTimesIsNotNull() {
            addCriterion("meet_times is not null");
            return (Criteria) this;
        }

        public Criteria andMeetTimesEqualTo(Integer value) {
            addCriterion("meet_times =", value, "meetTimes");
            return (Criteria) this;
        }

        public Criteria andMeetTimesNotEqualTo(Integer value) {
            addCriterion("meet_times <>", value, "meetTimes");
            return (Criteria) this;
        }

        public Criteria andMeetTimesGreaterThan(Integer value) {
            addCriterion("meet_times >", value, "meetTimes");
            return (Criteria) this;
        }

        public Criteria andMeetTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("meet_times >=", value, "meetTimes");
            return (Criteria) this;
        }

        public Criteria andMeetTimesLessThan(Integer value) {
            addCriterion("meet_times <", value, "meetTimes");
            return (Criteria) this;
        }

        public Criteria andMeetTimesLessThanOrEqualTo(Integer value) {
            addCriterion("meet_times <=", value, "meetTimes");
            return (Criteria) this;
        }

        public Criteria andMeetTimesIn(List<Integer> values) {
            addCriterion("meet_times in", values, "meetTimes");
            return (Criteria) this;
        }

        public Criteria andMeetTimesNotIn(List<Integer> values) {
            addCriterion("meet_times not in", values, "meetTimes");
            return (Criteria) this;
        }

        public Criteria andMeetTimesBetween(Integer value1, Integer value2) {
            addCriterion("meet_times between", value1, value2, "meetTimes");
            return (Criteria) this;
        }

        public Criteria andMeetTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("meet_times not between", value1, value2, "meetTimes");
            return (Criteria) this;
        }

        public Criteria andPassTimesIsNull() {
            addCriterion("pass_times is null");
            return (Criteria) this;
        }

        public Criteria andPassTimesIsNotNull() {
            addCriterion("pass_times is not null");
            return (Criteria) this;
        }

        public Criteria andPassTimesEqualTo(Integer value) {
            addCriterion("pass_times =", value, "passTimes");
            return (Criteria) this;
        }

        public Criteria andPassTimesNotEqualTo(Integer value) {
            addCriterion("pass_times <>", value, "passTimes");
            return (Criteria) this;
        }

        public Criteria andPassTimesGreaterThan(Integer value) {
            addCriterion("pass_times >", value, "passTimes");
            return (Criteria) this;
        }

        public Criteria andPassTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass_times >=", value, "passTimes");
            return (Criteria) this;
        }

        public Criteria andPassTimesLessThan(Integer value) {
            addCriterion("pass_times <", value, "passTimes");
            return (Criteria) this;
        }

        public Criteria andPassTimesLessThanOrEqualTo(Integer value) {
            addCriterion("pass_times <=", value, "passTimes");
            return (Criteria) this;
        }

        public Criteria andPassTimesIn(List<Integer> values) {
            addCriterion("pass_times in", values, "passTimes");
            return (Criteria) this;
        }

        public Criteria andPassTimesNotIn(List<Integer> values) {
            addCriterion("pass_times not in", values, "passTimes");
            return (Criteria) this;
        }

        public Criteria andPassTimesBetween(Integer value1, Integer value2) {
            addCriterion("pass_times between", value1, value2, "passTimes");
            return (Criteria) this;
        }

        public Criteria andPassTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("pass_times not between", value1, value2, "passTimes");
            return (Criteria) this;
        }

        public Criteria andSammaryIsNull() {
            addCriterion("sammary is null");
            return (Criteria) this;
        }

        public Criteria andSammaryIsNotNull() {
            addCriterion("sammary is not null");
            return (Criteria) this;
        }

        public Criteria andSammaryEqualTo(String value) {
            addCriterion("sammary =", value, "sammary");
            return (Criteria) this;
        }

        public Criteria andSammaryNotEqualTo(String value) {
            addCriterion("sammary <>", value, "sammary");
            return (Criteria) this;
        }

        public Criteria andSammaryGreaterThan(String value) {
            addCriterion("sammary >", value, "sammary");
            return (Criteria) this;
        }

        public Criteria andSammaryGreaterThanOrEqualTo(String value) {
            addCriterion("sammary >=", value, "sammary");
            return (Criteria) this;
        }

        public Criteria andSammaryLessThan(String value) {
            addCriterion("sammary <", value, "sammary");
            return (Criteria) this;
        }

        public Criteria andSammaryLessThanOrEqualTo(String value) {
            addCriterion("sammary <=", value, "sammary");
            return (Criteria) this;
        }

        public Criteria andSammaryLike(String value) {
            addCriterion("sammary like", value, "sammary");
            return (Criteria) this;
        }

        public Criteria andSammaryNotLike(String value) {
            addCriterion("sammary not like", value, "sammary");
            return (Criteria) this;
        }

        public Criteria andSammaryIn(List<String> values) {
            addCriterion("sammary in", values, "sammary");
            return (Criteria) this;
        }

        public Criteria andSammaryNotIn(List<String> values) {
            addCriterion("sammary not in", values, "sammary");
            return (Criteria) this;
        }

        public Criteria andSammaryBetween(String value1, String value2) {
            addCriterion("sammary between", value1, value2, "sammary");
            return (Criteria) this;
        }

        public Criteria andSammaryNotBetween(String value1, String value2) {
            addCriterion("sammary not between", value1, value2, "sammary");
            return (Criteria) this;
        }

        public Criteria andCreateTimesIsNull() {
            addCriterion("create_times is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimesIsNotNull() {
            addCriterion("create_times is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimesEqualTo(Date value) {
            addCriterion("create_times =", value, "createTimes");
            return (Criteria) this;
        }

        public Criteria andCreateTimesNotEqualTo(Date value) {
            addCriterion("create_times <>", value, "createTimes");
            return (Criteria) this;
        }

        public Criteria andCreateTimesGreaterThan(Date value) {
            addCriterion("create_times >", value, "createTimes");
            return (Criteria) this;
        }

        public Criteria andCreateTimesGreaterThanOrEqualTo(Date value) {
            addCriterion("create_times >=", value, "createTimes");
            return (Criteria) this;
        }

        public Criteria andCreateTimesLessThan(Date value) {
            addCriterion("create_times <", value, "createTimes");
            return (Criteria) this;
        }

        public Criteria andCreateTimesLessThanOrEqualTo(Date value) {
            addCriterion("create_times <=", value, "createTimes");
            return (Criteria) this;
        }

        public Criteria andCreateTimesIn(List<Date> values) {
            addCriterion("create_times in", values, "createTimes");
            return (Criteria) this;
        }

        public Criteria andCreateTimesNotIn(List<Date> values) {
            addCriterion("create_times not in", values, "createTimes");
            return (Criteria) this;
        }

        public Criteria andCreateTimesBetween(Date value1, Date value2) {
            addCriterion("create_times between", value1, value2, "createTimes");
            return (Criteria) this;
        }

        public Criteria andCreateTimesNotBetween(Date value1, Date value2) {
            addCriterion("create_times not between", value1, value2, "createTimes");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesIsNull() {
            addCriterion("update_times is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesIsNotNull() {
            addCriterion("update_times is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesEqualTo(Date value) {
            addCriterion("update_times =", value, "updateTimes");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesNotEqualTo(Date value) {
            addCriterion("update_times <>", value, "updateTimes");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesGreaterThan(Date value) {
            addCriterion("update_times >", value, "updateTimes");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesGreaterThanOrEqualTo(Date value) {
            addCriterion("update_times >=", value, "updateTimes");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesLessThan(Date value) {
            addCriterion("update_times <", value, "updateTimes");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesLessThanOrEqualTo(Date value) {
            addCriterion("update_times <=", value, "updateTimes");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesIn(List<Date> values) {
            addCriterion("update_times in", values, "updateTimes");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesNotIn(List<Date> values) {
            addCriterion("update_times not in", values, "updateTimes");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesBetween(Date value1, Date value2) {
            addCriterion("update_times between", value1, value2, "updateTimes");
            return (Criteria) this;
        }

        public Criteria andUpdateTimesNotBetween(Date value1, Date value2) {
            addCriterion("update_times not between", value1, value2, "updateTimes");
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