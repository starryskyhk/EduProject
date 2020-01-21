package com.yuxiu.edu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalaryDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryDetailExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryIsNull() {
            addCriterion("total_salary is null");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryIsNotNull() {
            addCriterion("total_salary is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryEqualTo(Long value) {
            addCriterion("total_salary =", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryNotEqualTo(Long value) {
            addCriterion("total_salary <>", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryGreaterThan(Long value) {
            addCriterion("total_salary >", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryGreaterThanOrEqualTo(Long value) {
            addCriterion("total_salary >=", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryLessThan(Long value) {
            addCriterion("total_salary <", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryLessThanOrEqualTo(Long value) {
            addCriterion("total_salary <=", value, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryIn(List<Long> values) {
            addCriterion("total_salary in", values, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryNotIn(List<Long> values) {
            addCriterion("total_salary not in", values, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryBetween(Long value1, Long value2) {
            addCriterion("total_salary between", value1, value2, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andTotalSalaryNotBetween(Long value1, Long value2) {
            addCriterion("total_salary not between", value1, value2, "totalSalary");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryIsNull() {
            addCriterion("social_salary is null");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryIsNotNull() {
            addCriterion("social_salary is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryEqualTo(Long value) {
            addCriterion("social_salary =", value, "socialSalary");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryNotEqualTo(Long value) {
            addCriterion("social_salary <>", value, "socialSalary");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryGreaterThan(Long value) {
            addCriterion("social_salary >", value, "socialSalary");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryGreaterThanOrEqualTo(Long value) {
            addCriterion("social_salary >=", value, "socialSalary");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryLessThan(Long value) {
            addCriterion("social_salary <", value, "socialSalary");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryLessThanOrEqualTo(Long value) {
            addCriterion("social_salary <=", value, "socialSalary");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryIn(List<Long> values) {
            addCriterion("social_salary in", values, "socialSalary");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryNotIn(List<Long> values) {
            addCriterion("social_salary not in", values, "socialSalary");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryBetween(Long value1, Long value2) {
            addCriterion("social_salary between", value1, value2, "socialSalary");
            return (Criteria) this;
        }

        public Criteria andSocialSalaryNotBetween(Long value1, Long value2) {
            addCriterion("social_salary not between", value1, value2, "socialSalary");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryIsNull() {
            addCriterion("house_salary is null");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryIsNotNull() {
            addCriterion("house_salary is not null");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryEqualTo(Long value) {
            addCriterion("house_salary =", value, "houseSalary");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryNotEqualTo(Long value) {
            addCriterion("house_salary <>", value, "houseSalary");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryGreaterThan(Long value) {
            addCriterion("house_salary >", value, "houseSalary");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryGreaterThanOrEqualTo(Long value) {
            addCriterion("house_salary >=", value, "houseSalary");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryLessThan(Long value) {
            addCriterion("house_salary <", value, "houseSalary");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryLessThanOrEqualTo(Long value) {
            addCriterion("house_salary <=", value, "houseSalary");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryIn(List<Long> values) {
            addCriterion("house_salary in", values, "houseSalary");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryNotIn(List<Long> values) {
            addCriterion("house_salary not in", values, "houseSalary");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryBetween(Long value1, Long value2) {
            addCriterion("house_salary between", value1, value2, "houseSalary");
            return (Criteria) this;
        }

        public Criteria andHouseSalaryNotBetween(Long value1, Long value2) {
            addCriterion("house_salary not between", value1, value2, "houseSalary");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(Long value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(Long value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(Long value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(Long value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(Long value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(Long value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<Long> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<Long> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(Long value1, Long value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(Long value1, Long value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryIsNull() {
            addCriterion("basic_salary is null");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryIsNotNull() {
            addCriterion("basic_salary is not null");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryEqualTo(Long value) {
            addCriterion("basic_salary =", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryNotEqualTo(Long value) {
            addCriterion("basic_salary <>", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryGreaterThan(Long value) {
            addCriterion("basic_salary >", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryGreaterThanOrEqualTo(Long value) {
            addCriterion("basic_salary >=", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryLessThan(Long value) {
            addCriterion("basic_salary <", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryLessThanOrEqualTo(Long value) {
            addCriterion("basic_salary <=", value, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryIn(List<Long> values) {
            addCriterion("basic_salary in", values, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryNotIn(List<Long> values) {
            addCriterion("basic_salary not in", values, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryBetween(Long value1, Long value2) {
            addCriterion("basic_salary between", value1, value2, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andBasicSalaryNotBetween(Long value1, Long value2) {
            addCriterion("basic_salary not between", value1, value2, "basicSalary");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyIsNull() {
            addCriterion("reward_money is null");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyIsNotNull() {
            addCriterion("reward_money is not null");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyEqualTo(Long value) {
            addCriterion("reward_money =", value, "rewardMoney");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyNotEqualTo(Long value) {
            addCriterion("reward_money <>", value, "rewardMoney");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyGreaterThan(Long value) {
            addCriterion("reward_money >", value, "rewardMoney");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("reward_money >=", value, "rewardMoney");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyLessThan(Long value) {
            addCriterion("reward_money <", value, "rewardMoney");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyLessThanOrEqualTo(Long value) {
            addCriterion("reward_money <=", value, "rewardMoney");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyIn(List<Long> values) {
            addCriterion("reward_money in", values, "rewardMoney");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyNotIn(List<Long> values) {
            addCriterion("reward_money not in", values, "rewardMoney");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyBetween(Long value1, Long value2) {
            addCriterion("reward_money between", value1, value2, "rewardMoney");
            return (Criteria) this;
        }

        public Criteria andRewardMoneyNotBetween(Long value1, Long value2) {
            addCriterion("reward_money not between", value1, value2, "rewardMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyIsNull() {
            addCriterion("punish_money is null");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyIsNotNull() {
            addCriterion("punish_money is not null");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyEqualTo(Long value) {
            addCriterion("punish_money =", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyNotEqualTo(Long value) {
            addCriterion("punish_money <>", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyGreaterThan(Long value) {
            addCriterion("punish_money >", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("punish_money >=", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyLessThan(Long value) {
            addCriterion("punish_money <", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyLessThanOrEqualTo(Long value) {
            addCriterion("punish_money <=", value, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyIn(List<Long> values) {
            addCriterion("punish_money in", values, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyNotIn(List<Long> values) {
            addCriterion("punish_money not in", values, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyBetween(Long value1, Long value2) {
            addCriterion("punish_money between", value1, value2, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andPunishMoneyNotBetween(Long value1, Long value2) {
            addCriterion("punish_money not between", value1, value2, "punishMoney");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyIsNull() {
            addCriterion("help_money is null");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyIsNotNull() {
            addCriterion("help_money is not null");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyEqualTo(Long value) {
            addCriterion("help_money =", value, "helpMoney");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyNotEqualTo(Long value) {
            addCriterion("help_money <>", value, "helpMoney");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyGreaterThan(Long value) {
            addCriterion("help_money >", value, "helpMoney");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("help_money >=", value, "helpMoney");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyLessThan(Long value) {
            addCriterion("help_money <", value, "helpMoney");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyLessThanOrEqualTo(Long value) {
            addCriterion("help_money <=", value, "helpMoney");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyIn(List<Long> values) {
            addCriterion("help_money in", values, "helpMoney");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyNotIn(List<Long> values) {
            addCriterion("help_money not in", values, "helpMoney");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyBetween(Long value1, Long value2) {
            addCriterion("help_money between", value1, value2, "helpMoney");
            return (Criteria) this;
        }

        public Criteria andHelpMoneyNotBetween(Long value1, Long value2) {
            addCriterion("help_money not between", value1, value2, "helpMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyIsNull() {
            addCriterion("actual_money is null");
            return (Criteria) this;
        }

        public Criteria andActualMoneyIsNotNull() {
            addCriterion("actual_money is not null");
            return (Criteria) this;
        }

        public Criteria andActualMoneyEqualTo(Long value) {
            addCriterion("actual_money =", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyNotEqualTo(Long value) {
            addCriterion("actual_money <>", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyGreaterThan(Long value) {
            addCriterion("actual_money >", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("actual_money >=", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyLessThan(Long value) {
            addCriterion("actual_money <", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyLessThanOrEqualTo(Long value) {
            addCriterion("actual_money <=", value, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyIn(List<Long> values) {
            addCriterion("actual_money in", values, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyNotIn(List<Long> values) {
            addCriterion("actual_money not in", values, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyBetween(Long value1, Long value2) {
            addCriterion("actual_money between", value1, value2, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andActualMoneyNotBetween(Long value1, Long value2) {
            addCriterion("actual_money not between", value1, value2, "actualMoney");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andSalaryDateIsNull() {
            addCriterion("salary_date is null");
            return (Criteria) this;
        }

        public Criteria andSalaryDateIsNotNull() {
            addCriterion("salary_date is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryDateEqualTo(Date value) {
            addCriterion("salary_date =", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateNotEqualTo(Date value) {
            addCriterion("salary_date <>", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateGreaterThan(Date value) {
            addCriterion("salary_date >", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("salary_date >=", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateLessThan(Date value) {
            addCriterion("salary_date <", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateLessThanOrEqualTo(Date value) {
            addCriterion("salary_date <=", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateIn(List<Date> values) {
            addCriterion("salary_date in", values, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateNotIn(List<Date> values) {
            addCriterion("salary_date not in", values, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateBetween(Date value1, Date value2) {
            addCriterion("salary_date between", value1, value2, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateNotBetween(Date value1, Date value2) {
            addCriterion("salary_date not between", value1, value2, "salaryDate");
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