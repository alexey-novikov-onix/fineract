/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.test.data.loanproduct;

public enum DefaultLoanProduct implements LoanProduct {

    LP1, //
    LP1_DUE_DATE, //
    LP1_INTEREST_FLAT, //
    LP1_INTEREST_DECLINING_BALANCE_PERIOD_SAME_AS_PAYMENT, //
    LP1_INTEREST_DECLINING_BALANCE_PERIOD_DAILY, //
    LP1_INTEREST_DECLINING_BALANCE_PERIOD_DAILY_ACCRUAL_ACTIVITY, //
    LP1_INTEREST_DECLINING_BALANCE_DAILY_RECALCULATION_COMPOUNDING_NONE_ACCRUAL_ACTIVITY, //
    LP1_1MONTH_INTEREST_DECLINING_BALANCE_DAILY_RECALCULATION_COMPOUNDING_MONTHLY, //
    LP1_INTEREST_DECLINING_BALANCE_DAILY_RECALCULATION_COMPOUNDING_NONE, //
    LP1_INTEREST_DECLINING_BALANCE_DAILY_RECALCULATION_COMPOUNDING_NONE_RESCHEDULE_REDUCE_NR_INST, //
    LP1_INTEREST_DECLINING_BALANCE_DAILY_RECALCULATION_COMPOUNDING_NONE_RESCHEDULE_RESCH_NEXT_REP, //
    LP1_INTEREST_DECLINING_BALANCE_DAILY_RECALCULATION_SAME_AS_REPAYMENT_COMPOUNDING_NONE, //
    LP1_INTEREST_DECLINING_BALANCE_SAR_RECALCULATION_SAME_AS_REPAYMENT_COMPOUNDING_NONE_MULTIDISB, //
    LP1_PAYMENT_STRATEGY_DUE_IN_ADVANCE, //
    LP1_PAYMENT_STRATEGY_DUE_IN_ADVANCE_INTEREST_FLAT, //
    LP1_PAYMENT_STRATEGY_DUE_IN_ADVANCE_PENALTY_INTEREST_PRINCIPAL_FEE, //
    LP1_PAYMENT_STRATEGY_DUE_IN_ADVANCE_PENALTY_INTEREST_PRINCIPAL_FEE_INTEREST_FLAT, //
    LP1_INTEREST_FLAT_OVERDUE_FROM_AMOUNT, //
    LP1_INTEREST_FLAT_OVERDUE_FROM_AMOUNT_INTEREST, //
    LP2_DOWNPAYMENT, //
    LP2_DOWNPAYMENT_AUTO, //
    LP2_DOWNPAYMENT_AUTO_ADVANCED_PAYMENT_ALLOCATION, //
    LP2_DOWNPAYMENT_ADVANCED_PAYMENT_ALLOCATION, //
    LP2_DOWNPAYMENT_INTEREST, //
    LP2_DOWNPAYMENT_INTEREST_AUTO, //
    LP2_DOWNPAYMENT_ADV_PMT_ALLOC_PROGRESSIVE_LOAN_SCHEDULE_HORIZONTAL, //
    LP2_DOWNPAYMENT_ADV_PMT_ALLOC_PROGRESSIVE_LOAN_SCHEDULE_VERTICAL, //
    LP2_DOWNPAYMENT_ADV_PMT_ALLOC_PROGRESSIVE_LOAN_SCHEDULE_HORIZONTAL_INSTALLMENT_LEVEL_DELINQUENCY, //
    LP2_DOWNPAYMENT_ADV_PMT_ALLOC_PROG_SCHEDULE_HOR_INST_LVL_DELINQUENCY_CREDIT_ALLOCATION, //
    LP2_DOWNPAYMENT_ADV_PMT_ALLOC_FIXED_LENGTH, //
    LP2_DOWNPAYMENT_AUTO_ADVANCED_PAYMENT_ALLOCATION_REPAYMENT_START_SUBMITTED, //
    LP2_DOWNPAYMENT_INTEREST_FLAT_ADV_PMT_ALLOC, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_ACTUAL_ACTUAL, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_ACTUAL_ACTUAL_ACCRUAL_ACTIVITY, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_360_30, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_360_30_INTEREST_RECALCULATION_DAILY_TILL_PRECLOSE, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_360_30_INTEREST_RECALCULATION_DAILY_TILL_PRECLOSE_PMT_ALLOC_1, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_360_30_INTEREST_RECALCULATION_SARP_TILL_PRECLOSE, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_360_30_INTEREST_RECALCULATION_DAILY_TILL_REST_FREQUENCY_DATE, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_360_30_INTEREST_RECALCULATION_SARP_TILL_REST_FREQUENCY_DATE, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_ACTUAL_ACTUAL_INTEREST_REFUND_FULL, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_360_30_MULTIDISBURSE, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_360_30_MULTIDISBURSE_DOWNPAYMENT, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_360_30_DOWNPAYMENT, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_365_ACTUAL, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_ACTUAL_ACTUAL_INTEREST_REFUND, //
    LP1_ADV_PMT_ALLOC_PROGRESSIVE_LOAN_SCHEDULE_HORIZONTAL, //
    LP2_ADV_CUSTOM_PMT_ALLOC_PROGRESSIVE_LOAN_SCHEDULE_HORIZONTAL, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_360_30_INTEREST_RECALCULATION_DAILY_TILL_PRECLOSE_WHOLE_TERM, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_360_30_IR_DAILY_TILL_PRECLOSE_LAST_INSTALLMENT_STRATEGY, //
    LP2_ADV_PYMNT_INTEREST_DAILY_EMI_ACTUAL_ACTUAL_INTEREST_REFUND_INTEREST_RECALCULATION, //
    ;

    @Override
    public String getName() {
        return name();
    }
}
