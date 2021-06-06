
# PASS PAYSTACK TRANSACTION CHARGE TO CUSTOMER

PaystackTransactionChargeToCustomer provides the implementation to the formula provided by the Paystack support team as regards passing the Paystack transaction charge to customers [Here's the article](https://support.paystack.com/hc/en-us/articles/360009973579-Can-I-pass-the-transaction-charges-to-my-customers-) . 

## Before getting started
This library currently only works with the Nigerian Paystack Charges

*Flat Fee*
100 Naira

*Decimal Fee*
1.5%

### Get Started
This library would help you calculate the total amount to charge the customer including the Paystack charges. All you need to do is ...


### Install
##### gradle

1. Add it in your root build.gradle at the end of repositories:

``` gradle
allprojects {
  repositories {
   ...
   maven { url 'https://jitpack.io' }
  }
}

```

2. Add the dependency:

```
dependencies {
  implementation 'com.github.olaitanade:PaystackTransactionChargesToCus:1.1'
 }
```

### Usage 
``` java
String totalPrice = PaystackTransactionChargesToCus.calculateTotalPrice("1000");
```

#### Constants

|Name                   | Type           | Required            | Default Value       | Description         |
|-----------------------|----------------|---------------------|---------------------|---------------------|
|  `DECIMAL_FEE `         | `Double`      | true                |  0.0150               | 
|  `FEE_CAP `               | `int`       | true                |  2000          | 
|  `FLAT_FEE`              | `int`       | true                |  100          | 


## Done 
Checkout Paystack [API](https://paystack.com/docs/) 
