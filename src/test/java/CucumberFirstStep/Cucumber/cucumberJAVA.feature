Feature: Cash withdrawal 

Scenario: Withdrawal from an account in credit 

Given An existing client named Pierre-Jean with 100 EUR in his account 

When He withdraws 10 EUR from his account

Then The new balance is 90 EUR