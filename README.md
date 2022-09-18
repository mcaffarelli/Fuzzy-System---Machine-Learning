# Fuzzy-System-Machine-Learning

Fuzzy logic is used in many different machine learning algorithms, and I wrote this program to demonstrate how fuzzy logic can be used in a real world problem. 
The system is designed to regulate your pool temperature for the user. The inputs for the system are water level and pool temperature. The output will be the percentage of power the pool heater needs to be running at to keep your pool at a good temperature to swim. 

Fuzzy logic is based on fuzzy rules and fuzzy sets. 

WL - Stands for Water Level

LL - Stands for Light Water Level

ML - Stands for Medium Water Level

HL- Stands for High Water Level 

T - Stands for Temperature

LT - Stands for Low Temperature

MT - Stands for Medium Temperature

HT- Stands for High Temperature

H - Stands for Heater Level

LH - Stands for Low Heater Level

MH - Stands for Medium Heater Level

HJH - Stands for High Heater Level

FUZZY SETS: 

![image](https://user-images.githubusercontent.com/81937437/190922065-3308266e-99a5-43c6-8fea-46a0498068d3.png)

FUZZY RULES: 

![image](https://user-images.githubusercontent.com/81937437/190922125-5ce34c6c-7e08-4ac2-a849-191002782782.png)

Once the Fuzzy sets and Fuzzy rules are defined, a fuzzy system can be programmed to calculate the correct output (Heater Level). 

--------------------------------------------------------------------------------------------------------------------------------------------------------

Below are the screenshots of the Fuzzy Algorithm working: 

EXAMPLE 1. I entered '7000' for the pools water level and entered '95' for the pool's current temperature. The output was 25 which indicates that the heater level should be 25% capacity. 

![image](https://user-images.githubusercontent.com/81937437/190922336-9c999d42-c5ae-494c-b81e-c8b05ec69613.png)


EXAMPLE 2. I entered '20000' for the pools water level and entered '50' for the pool’s current temperature. The output was 50 which indicates that the heater level should be 50% capacity.


![image](https://user-images.githubusercontent.com/81937437/190922442-17e26123-88cf-4776-bcf2-37edc5ee7b93.png)


Please see this excel document to show how the fuzzy system works and what I based my java code on : [Fuzzy System.xlsx](https://github.com/mcaffarelli/Fuzzy-System---Machine-Learning/files/9594970/Fuzzy.System.xlsx)
