DROP TABLE IF EXISTS cstmr;
 
CREATE TABLE cstmr (
    CUST_ID Bigserial PRIMARY KEY NOT NULL,
    NAME varchar(100) NOT NULL,
    AGE smallint NOT NULL
);