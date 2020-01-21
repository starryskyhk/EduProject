package com.yuxiu.edu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNull() {
            addCriterion("course_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNotNull() {
            addCriterion("course_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeEqualTo(String value) {
            addCriterion("course_time =", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotEqualTo(String value) {
            addCriterion("course_time <>", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThan(String value) {
            addCriterion("course_time >", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("course_time >=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThan(String value) {
            addCriterion("course_time <", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThanOrEqualTo(String value) {
            addCriterion("course_time <=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLike(String value) {
            addCriterion("course_time like", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotLike(String value) {
            addCriterion("course_time not like", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIn(List<String> values) {
            addCriterion("course_time in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotIn(List<String> values) {
            addCriterion("course_time not in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeBetween(String value1, String value2) {
            addCriterion("course_time between", value1, value2, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotBetween(String value1, String value2) {
            addCriterion("course_time not between", value1, value2, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNull() {
            addCriterion("course_price is null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIsNotNull() {
            addCriterion("course_price is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePriceEqualTo(Long value) {
            addCriterion("course_price =", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotEqualTo(Long value) {
            addCriterion("course_price <>", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThan(Long value) {
            addCriterion("course_price >", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("course_price >=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThan(Long value) {
            addCriterion("course_price <", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceLessThanOrEqualTo(Long value) {
            addCriterion("course_price <=", value, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceIn(List<Long> values) {
            addCriterion("course_price in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotIn(List<Long> values) {
            addCriterion("course_price not in", values, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceBetween(Long value1, Long value2) {
            addCriterion("course_price between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCoursePriceNotBetween(Long value1, Long value2) {
            addCriterion("course_price not between", value1, value2, "coursePrice");
            return (Criteria) this;
        }

        public Criteria andCourseAddressIsNull() {
            addCriterion("course_address is null");
            return (Criteria) this;
        }

        public Criteria andCourseAddressIsNotNull() {
            addCriterion("course_address is not null");
            return (Criteria) this;
        }

        public Criteria andCourseAddressEqualTo(String value) {
            addCriterion("course_address =", value, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andCourseAddressNotEqualTo(String value) {
            addCriterion("course_address <>", value, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andCourseAddressGreaterThan(String value) {
            addCriterion("course_address >", value, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andCourseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("course_address >=", value, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andCourseAddressLessThan(String value) {
            addCriterion("course_address <", value, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andCourseAddressLessThanOrEqualTo(String value) {
            addCriterion("course_address <=", value, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andCourseAddressLike(String value) {
            addCriterion("course_address like", value, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andCourseAddressNotLike(String value) {
            addCriterion("course_address not like", value, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andCourseAddressIn(List<String> values) {
            addCriterion("course_address in", values, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andCourseAddressNotIn(List<String> values) {
            addCriterion("course_address not in", values, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andCourseAddressBetween(String value1, String value2) {
            addCriterion("course_address between", value1, value2, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andCourseAddressNotBetween(String value1, String value2) {
            addCriterion("course_address not between", value1, value2, "courseAddress");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateIsNull() {
            addCriterion("expected_startdate is null");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateIsNotNull() {
            addCriterion("expected_startdate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateEqualTo(Date value) {
            addCriterion("expected_startdate =", value, "expectedStartdate");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateNotEqualTo(Date value) {
            addCriterion("expected_startdate <>", value, "expectedStartdate");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateGreaterThan(Date value) {
            addCriterion("expected_startdate >", value, "expectedStartdate");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("expected_startdate >=", value, "expectedStartdate");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateLessThan(Date value) {
            addCriterion("expected_startdate <", value, "expectedStartdate");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateLessThanOrEqualTo(Date value) {
            addCriterion("expected_startdate <=", value, "expectedStartdate");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateIn(List<Date> values) {
            addCriterion("expected_startdate in", values, "expectedStartdate");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateNotIn(List<Date> values) {
            addCriterion("expected_startdate not in", values, "expectedStartdate");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateBetween(Date value1, Date value2) {
            addCriterion("expected_startdate between", value1, value2, "expectedStartdate");
            return (Criteria) this;
        }

        public Criteria andExpectedStartdateNotBetween(Date value1, Date value2) {
            addCriterion("expected_startdate not between", value1, value2, "expectedStartdate");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateIsNull() {
            addCriterion("expected_enddate is null");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateIsNotNull() {
            addCriterion("expected_enddate is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateEqualTo(Date value) {
            addCriterion("expected_enddate =", value, "expectedEnddate");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateNotEqualTo(Date value) {
            addCriterion("expected_enddate <>", value, "expectedEnddate");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateGreaterThan(Date value) {
            addCriterion("expected_enddate >", value, "expectedEnddate");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("expected_enddate >=", value, "expectedEnddate");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateLessThan(Date value) {
            addCriterion("expected_enddate <", value, "expectedEnddate");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateLessThanOrEqualTo(Date value) {
            addCriterion("expected_enddate <=", value, "expectedEnddate");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateIn(List<Date> values) {
            addCriterion("expected_enddate in", values, "expectedEnddate");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateNotIn(List<Date> values) {
            addCriterion("expected_enddate not in", values, "expectedEnddate");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateBetween(Date value1, Date value2) {
            addCriterion("expected_enddate between", value1, value2, "expectedEnddate");
            return (Criteria) this;
        }

        public Criteria andExpectedEnddateNotBetween(Date value1, Date value2) {
            addCriterion("expected_enddate not between", value1, value2, "expectedEnddate");
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