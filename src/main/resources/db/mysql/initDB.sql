CREATE DATABASE IF NOT EXISTS payspec;

ALTER DATABASE payspec
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

-- GRANT ALL PRIVILEGES ON payspec.* TO payspec@localhost IDENTIFIED BY 'payspec';

USE payspec;

CREATE TABLE user (
                      user_type varchar(31) NOT NULL,
                      id bigint(20) NOT NULL AUTO_INCREMENT,
                      birth_date date ,
                      email varchar(45) NOT NULL,
                      employeeId varchar(255) ,
                      enabled bit(1) ,
                      first_name varchar(15) ,
                      gender varchar(255) ,
                      gsm_number varchar(255) ,
                      last_logon_date datetime ,
                      last_logout_date datetime ,
                      last_name varchar(15) ,
                      merchant_id varchar(255) ,
                      middle_name varchar(15) ,
                      password varchar(100) ,
                      paychant_id varchar(255) ,
                      photo longblob,
                      profile_pic varchar(255) ,
                      answer varchar(25) ,
                      question varchar(25) ,
                      start_date date ,
                      username varchar(25) NOT NULL,
                      u_type varchar(255) ,
                      version int(11) ,
                      pension bigint(20) ,
                      salary decimal(19,2) ,
                      vacation int(11) ,
                      institution_id bigint(20) ,
                      organization_id bigint(20) ,
                      national_id varchar(255) ,
                      base_url varchar(255) ,
                      PRIMARY KEY (id),
                      UNIQUE KEY UK_ob8kqyqqgmefl0aco34akdtpe (email),
                      UNIQUE KEY UK_sb8bbouer5wak8vyiiy4pf2bx (username),
                      KEY FKjbkkfl7f3ffm66dmg5aw4yfv3 (institution_id),
                      KEY FKi3ynrf4qjomj2hdjx7ssa3mlh (organization_id)
--  CONSTRAINT FKi3ynrf4qjomj2hdjx7ssa3mlh FOREIGN KEY (organization_id) REFERENCES organization (id),
--                      CONSTRAINT FKjbkkfl7f3ffm66dmg5aw4yfv3 FOREIGN KEY (institution_id) REFERENCES institution (id)
) ENGINE=InnoDB;

CREATE TABLE bank_account (
  acc_type varchar(31) NOT NULL,
  id bigint(20) NOT NULL AUTO_INCREMENT,
  account_number varchar(255) NOT NULL,
  account_type varchar(255) ,
  active varchar(255) ,
  balance_amount int(11) ,
  bvn varchar(255) NOT NULL,
  creation_date datetime ,
  last_transaction_ts datetime ,
  bank_account_id int(11) ,
  email varchar(255) ,
  amount int(11) ,
  fixed_deposit_id varchar(255) ,
  tenure int(11) ,
  account_owner bigint(20) NOT NULL,
  enabled bit(1) ,
  PRIMARY KEY (id),
  UNIQUE KEY UK_mb8kv2x9143o96jgxbv6mahcq (account_number),
  UNIQUE KEY UK_gajgbhlc3e40sr9um1v5qxdyy (bvn),
  UNIQUE KEY UK_5hwjrq1rqea6cavdrrwgdpj6y (fixed_deposit_id),
  KEY FKa6xdvmnurlb6posacfxvqkoei (account_owner),
  CONSTRAINT FKa6xdvmnurlb6posacfxvqkoei FOREIGN KEY (account_owner) REFERENCES user (id)
) ENGINE=InnoDB;

CREATE TABLE email_notification (
  email_address varchar(255) NOT NULL,
  id bigint(20) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE institution (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(255) ,
  status bit(1) ,
  PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE profile (
                         id bigint(20) NOT NULL AUTO_INCREMENT,
                         base_url varchar(255) ,
                         description varchar(255) ,
                         name varchar(50) ,
                         status bit(1) ,
                         PRIMARY KEY (id),
                         UNIQUE KEY UK_h0misxfxi90txd9e2cf1owm8j (name)
) ENGINE=InnoDB;

CREATE TABLE user_profile (
                              user_id bigint(20) NOT NULL,
                              profile_id bigint(20) NOT NULL,
                              PRIMARY KEY (user_id,profile_id),
                              KEY FKqfbftbxicceqbmvj87g9be2qn (profile_id),
                              CONSTRAINT FK6kwj5lk78pnhwor4pgosvb51r FOREIGN KEY (user_id) REFERENCES user (id),
                              CONSTRAINT FKqfbftbxicceqbmvj87g9be2qn FOREIGN KEY (profile_id) REFERENCES profile (id)
) ENGINE=InnoDB;

CREATE TABLE role (
                      id bigint(20) NOT NULL AUTO_INCREMENT,
                      name varchar(50) ,
                      status bit(1) ,
                      PRIMARY KEY (id),
                      UNIQUE KEY UK_8sewwnpamngi6b1dwaa88askk (name)
) ENGINE=InnoDB;

CREATE TABLE profile_role (
                              profle_id bigint(20) NOT NULL,
                              role_id bigint(20) NOT NULL,
                              PRIMARY KEY (profle_id,role_id),
                              KEY FK9sx4d1mv1bx7ycdst08d1grmh (role_id),
                              CONSTRAINT FK9sx4d1mv1bx7ycdst08d1grmh FOREIGN KEY (role_id) REFERENCES role (id),
                              CONSTRAINT FKfxm6jirh0h1bl70x0jdr3o2fj FOREIGN KEY (profle_id) REFERENCES profile (id)
) ENGINE=InnoDB;

CREATE TABLE menu (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  display_index int(11) ,
  menu_icon varchar(255) ,
  menu_url varchar(255) ,
  name varchar(255) NOT NULL,
  status bit(1) ,
  profile_id bigint(20) ,
  PRIMARY KEY (id),
  KEY FKkgr6kxbpcvh4k77eysajxg2r8 (profile_id),
  CONSTRAINT FKkgr6kxbpcvh4k77eysajxg2r8 FOREIGN KEY (profile_id) REFERENCES profile (id)
) ENGINE=InnoDB;

CREATE TABLE role_menu (
                           role_id bigint(20) NOT NULL,
                           menu_id bigint(20) NOT NULL,
                           PRIMARY KEY (role_id,menu_id),
                           KEY FKfg4e2mb2318tph615gh44ll3 (menu_id),
                           CONSTRAINT FKfg4e2mb2318tph615gh44ll3 FOREIGN KEY (menu_id) REFERENCES menu (id),
                           CONSTRAINT FKqyvxw2gg2qk0wld3bqfcb58vq FOREIGN KEY (role_id) REFERENCES role (id)
) ENGINE=InnoDB;

CREATE TABLE notification (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  created_on datetime ,
  first_name varchar(255) ,
  last_name varchar(255) ,
  PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE organization (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  email varchar(255) ,
  name varchar(255) ,
  phone_number varchar(255) ,
  status bit(1) ,
  institution_id bigint(20) ,
  PRIMARY KEY (id),
  KEY FK7cyjtnlf9mfqiw77vxu2wrd45 (institution_id),
  CONSTRAINT FK7cyjtnlf9mfqiw77vxu2wrd45 FOREIGN KEY (institution_id) REFERENCES institution (id)
) ENGINE=InnoDB ;

CREATE TABLE product (
                         p_type varchar(31) NOT NULL,
                         id bigint(20) NOT NULL AUTO_INCREMENT,
                         description varchar(255) ,
                         name varchar(255) ,
                         product_id varchar(255) ,
                         status bit(1) ,
                         organization_id bigint(20) ,
                         p_class int(11) ,
                         PRIMARY KEY (id),
                         KEY FKd7o25pueh2dsexxvtu2hia4i3 (organization_id)
--  CONSTRAINT FKd7o25pueh2dsexxvtu2hia4i3 FOREIGN KEY (organization_id) REFERENCES organization (id)
) ENGINE=InnoDB;

CREATE TABLE organization_product (
  Organization_id bigint(20) NOT NULL,
  products_id bigint(20) NOT NULL,
  UNIQUE KEY UK_f6gpl19fggma3o4jn3g0ab3l0 (products_id),
  KEY FKjqernv4alnsceqgkrla42kuqu (Organization_id)
) ENGINE=InnoDB;

CREATE TABLE payment (
  p_type varchar(31) NOT NULL,
  id bigint(20) NOT NULL AUTO_INCREMENT,
  amount decimal(19,2) ,
  payment_charge double ,
  payment_date datetime ,
  payment_description varchar(255) ,
  payment_id varchar(255) ,
  paymentStatus varchar(255) ,
  paymentType varchar(255) ,
  payee bigint(20) NOT NULL,
  payer bigint(20) NOT NULL,
  PRIMARY KEY (id),
  KEY FKtf6xlf1ghy9ovs4ne3wiqca5w (payee),
  KEY FKtoucfll90ehr51ibs1s389wdf (payer),
  CONSTRAINT FKtf6xlf1ghy9ovs4ne3wiqca5w FOREIGN KEY (payee) REFERENCES user (id),
  CONSTRAINT FKtoucfll90ehr51ibs1s389wdf FOREIGN KEY (payer) REFERENCES user (id)
) ENGINE=InnoDB;

CREATE TABLE payment_product_association (
  payment_id bigint(20) NOT NULL,
  product_id bigint(20) NOT NULL,
  KEY FKkxdn86qsfvk8kec6cn1jod0ot (product_id),
  KEY FKmwmhxib9q1s16irfordkqpjwf (payment_id)
) ENGINE=InnoDB;

CREATE TABLE privilege (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  description varchar(255) ,
  name varchar(255) NOT NULL,
  version int(11) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_h7iwbdg4ev8mgvmij76881tx8 (name)
) ENGINE=InnoDB;

CREATE TABLE product_category (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(255) ,
  PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE product_sub_category (
  id int(11) NOT NULL AUTO_INCREMENT,
  category varchar(255) ,
  name varchar(255) ,
  product_category_id bigint(20) ,
  PRIMARY KEY (id),
  KEY FK1n6k1t52xs6uvcnnwuuu3qf0d (product_category_id)
) ENGINE=InnoDB;

CREATE TABLE product_subcategory (
  product_id bigint(20) NOT NULL,
  product_subcat_id int(11) NOT NULL,
  PRIMARY KEY (product_id,product_subcat_id),
  KEY FKmlq39oiwset161ujgbh5rd2d1 (product_subcat_id)
) ENGINE=InnoDB;

CREATE TABLE sms_notification (
  phone_number varchar(255) NOT NULL,
  id bigint(20) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB;

CREATE TABLE app_configuration (
                                   id bigint(20) NOT NULL AUTO_INCREMENT,
                                   asset_type varchar(255) ,
                                   config_name varchar(255) ,
                                   config_status bit(1) ,
                                   config_type varchar(255) ,
                                   config_value varchar(255) ,
                                   PRIMARY KEY (id)
) ENGINE=InnoDB;
