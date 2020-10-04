-- Adminer 4.7.7 MySQL dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

DROP TABLE IF EXISTS `billinfo`;
CREATE TABLE `billinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `accept_station` varchar(50) DEFAULT NULL,
  `bill_code` varchar(50) DEFAULT NULL,
  `bill_state` varchar(50) DEFAULT NULL,
  `bill_type` varchar(50) DEFAULT NULL,
  `write_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `billrelease`;
CREATE TABLE `billrelease` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `accept_station` varchar(50) DEFAULT NULL,
  `bill_code` varchar(50) DEFAULT NULL,
  `bill_type` varchar(50) DEFAULT NULL,
  `receive_bill_person` varchar(50) DEFAULT NULL,
  `receive_bill_time` date DEFAULT NULL,
  `release_person` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `callbackinfo`;
CREATE TABLE `callbackinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bill_id` varchar(50) DEFAULT NULL,
  `bill_type` varchar(50) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `dial_no` varchar(50) DEFAULT NULL,
  `finally_dial_time` date DEFAULT NULL,
  `goods_bill_id` varchar(50) DEFAULT NULL,
  `locked` bit(1) NOT NULL,
  `success` bit(1) NOT NULL,
  `type` varchar(50) DEFAULT NULL,
  `write_time` date DEFAULT NULL,
  `writer` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `carcost`;
CREATE TABLE `carcost` (
  `driver_code` varchar(50) NOT NULL,
  `add_carriage_total` double NOT NULL,
  `allow_carry_weight` double DEFAULT NULL,
  `back_bill_code` varchar(255) DEFAULT NULL,
  `balance_time` datetime(6) DEFAULT NULL,
  `car_no` varchar(50) DEFAULT NULL,
  `car_type` varchar(50) DEFAULT NULL,
  `car_width` varchar(255) DEFAULT NULL,
  `carry_fee_total` double NOT NULL,
  `deal_goods_station` varchar(50) DEFAULT NULL,
  `fact_carriage_total` double NOT NULL,
  `goods_height` varchar(50) DEFAULT NULL,
  `load_station` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`driver_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `cargoerror`;
CREATE TABLE `cargoerror` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer` varchar(50) DEFAULT NULL,
  `goods_bill_code` varchar(50) DEFAULT NULL,
  `goods_name` varchar(50) DEFAULT NULL,
  `goods_revert_bill_code` varchar(50) DEFAULT NULL,
  `goods_value` double DEFAULT NULL,
  `mistake_type` varchar(50) DEFAULT NULL,
  `piece_amount` int(11) DEFAULT NULL,
  `size` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `cargoreceipt`;
CREATE TABLE `cargoreceipt` (
  `goods_revert_bill_code` varchar(50) NOT NULL,
  `accept_station` varchar(50) DEFAULT NULL,
  `all_carriage` double NOT NULL,
  `arrive_time` date DEFAULT NULL,
  `back_bill_state` varchar(50) DEFAULT NULL,
  `carriage_banlance_mode` varchar(50) DEFAULT NULL,
  `carriage_mode` varchar(50) DEFAULT NULL,
  `carry_goods_bill_deposit` double NOT NULL,
  `carry_goods_insurance` double NOT NULL,
  `deal_goods_station` varchar(50) DEFAULT NULL,
  `dispatch_service_fee` double NOT NULL,
  `driver_id` varchar(50) DEFAULT NULL,
  `if_balance` varchar(50) DEFAULT NULL,
  `insurance` double NOT NULL,
  `linkman_phone` varchar(50) DEFAULT NULL,
  `load_station` varchar(50) DEFAULT NULL,
  `receive_goods_detail_addr` varchar(50) DEFAULT NULL,
  `receive_goods_linkman` varchar(50) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `sign_time` date DEFAULT NULL,
  `start_advance` double NOT NULL,
  `start_carry_time` date DEFAULT NULL,
  PRIMARY KEY (`goods_revert_bill_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `cargoreceiptdetail`;
CREATE TABLE `cargoreceiptdetail` (
  `goods_revert_bill_id` varchar(50) NOT NULL,
  `goods_bill_detail_id` varchar(255) DEFAULT NULL,
  `goods_value` double NOT NULL,
  `piece_amount` int(11) NOT NULL,
  `price_mode` varchar(50) NOT NULL,
  `price_standard` varchar(50) NOT NULL,
  `volume` double NOT NULL,
  `weight` double NOT NULL,
  PRIMARY KEY (`goods_revert_bill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `cityexpand`;
CREATE TABLE `cityexpand` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city_id` int(11) NOT NULL,
  `range_city` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `compensationinfo`;
CREATE TABLE `compensationinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amends` double NOT NULL,
  `amends_time` date DEFAULT NULL,
  `bad_destroy_goods` double NOT NULL,
  `customer` varchar(50) DEFAULT NULL,
  `receive_station_id` int(11) NOT NULL,
  `receive_station_name` varchar(50) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `write_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `complaintinfo`;
CREATE TABLE `complaintinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `appeal_content` varchar(50) DEFAULT NULL,
  `appeal_date` varchar(50) DEFAULT NULL,
  `call_back_date` varchar(50) DEFAULT NULL,
  `customer` varchar(50) DEFAULT NULL,
  `deal_date` varchar(50) DEFAULT NULL,
  `deal_person` varchar(50) DEFAULT NULL,
  `deal_result` varchar(50) DEFAULT NULL,
  `goods_bill_code` varchar(50) DEFAULT NULL,
  `if_callback` bit(1) DEFAULT NULL,
  `if_handle` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `contactsservice`;
CREATE TABLE `contactsservice` (
  `send_goods_customer` varchar(50) NOT NULL,
  `balance` double NOT NULL,
  `bill_money` double NOT NULL,
  `carriage` double NOT NULL,
  `goods_bill_code` varchar(50) DEFAULT NULL,
  `insurance` double NOT NULL,
  `money_receivable` double NOT NULL,
  `receive_goods_addr` varchar(50) DEFAULT NULL,
  `received_money` double NOT NULL,
  `send_goods_addr` varchar(50) DEFAULT NULL,
  `send_goods_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`send_goods_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `customeramount`;
CREATE TABLE `customeramount` (
  `send_goods_customer` varchar(50) NOT NULL,
  `carriage_total` double NOT NULL,
  `insurance_total` double NOT NULL,
  `piece_amount_total` int(11) NOT NULL,
  PRIMARY KEY (`send_goods_customer`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `customerbillclear`;
CREATE TABLE `customerbillclear` (
  `goods_bill_code` varchar(50) NOT NULL,
  `customer_code` varchar(255) DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `balance_time` date DEFAULT NULL,
  `balance_type` varchar(50) DEFAULT NULL,
  `bill_money` double DEFAULT NULL,
  `carriage_reduce_fund` double DEFAULT NULL,
  `carry_goods_fee` double DEFAULT NULL,
  `insurance` double DEFAULT NULL,
  `money_receivable` double DEFAULT NULL,
  `pay_kickback` double DEFAULT NULL,
  `prepay_money` double DEFAULT NULL,
  `received_money` double DEFAULT NULL,
  PRIMARY KEY (`goods_bill_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `customerinfo`;
CREATE TABLE `customerinfo` (
  `customer_code` varchar(50) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `customer` varchar(50) DEFAULT NULL,
  `customer_type` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `enterprise_property` varchar(50) DEFAULT NULL,
  `enterprise_size` varchar(50) DEFAULT NULL,
  `fax` varchar(50) DEFAULT NULL,
  `linkman` varchar(50) DEFAULT NULL,
  `linkman_mobile` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `post_code` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`customer_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `customerreceiptinfo`;
CREATE TABLE `customerreceiptinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `carry_bill_event_id` int(11) NOT NULL,
  `check_goods_record` varchar(50) DEFAULT NULL,
  `customer` varchar(50) DEFAULT NULL,
  `goods_bill_code` varchar(50) DEFAULT NULL,
  `receive_goods_date` date DEFAULT NULL,
  `receive_goods_person` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `driveramount`;
CREATE TABLE `driveramount` (
  `driver_code` varchar(50) NOT NULL,
  `add_carriage_total` double NOT NULL,
  `carry_fee_total` double NOT NULL,
  `total` double NOT NULL,
  PRIMARY KEY (`driver_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `driverclear`;
CREATE TABLE `driverclear` (
  `back_bill_code` varchar(50) NOT NULL,
  `add_carriage` double DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `balance_time` date DEFAULT NULL,
  `balance_type` varchar(50) DEFAULT NULL,
  `bind_insurance` double DEFAULT NULL,
  `carry_fee` double DEFAULT NULL,
  `dispatch_service_fee` double DEFAULT NULL,
  `driver_code` varchar(50) DEFAULT NULL,
  `insurance` double DEFAULT NULL,
  `need_payment` double DEFAULT NULL,
  `payed_money` double DEFAULT NULL,
  `prepay_money` double DEFAULT NULL,
  PRIMARY KEY (`back_bill_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `driverinfo`;
CREATE TABLE `driverinfo` (
  `id` varchar(50) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `allow_carry_volume` double DEFAULT NULL,
  `allow_carry_weight` double DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `biz_licence` varchar(50) DEFAULT NULL,
  `car_dept` varchar(50) DEFAULT NULL,
  `car_dept_tel` varchar(50) DEFAULT NULL,
  `car_frame_no` varchar(50) DEFAULT NULL,
  `car_length` varchar(50) DEFAULT NULL,
  `car_no` varchar(50) DEFAULT NULL,
  `car_type` varchar(50) DEFAULT NULL,
  `car_width` varchar(50) DEFAULT NULL,
  `company_car` bit(1) NOT NULL,
  `drive_licence` varchar(50) DEFAULT NULL,
  `driver_name` varchar(50) DEFAULT NULL,
  `engine_no` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `goods_height` varchar(50) DEFAULT NULL,
  `id_card` varchar(50) DEFAULT NULL,
  `insurance_card` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `run_licence` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `employee_code` varchar(50) NOT NULL,
  `birthday` date DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  `employee_name` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `position` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`employee_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `employeeuser`;
CREATE TABLE `employeeuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `employeewage`;
CREATE TABLE `employeewage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `allowance` double NOT NULL,
  `basic_wage` double NOT NULL,
  `date` date DEFAULT NULL,
  `employee` varchar(50) DEFAULT NULL,
  `employee_code` varchar(50) NOT NULL,
  `station_wage` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `extraclear`;
CREATE TABLE `extraclear` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `balance_date` date DEFAULT NULL,
  `balance_money` double DEFAULT NULL,
  `balance_type` varchar(50) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `subject_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `extraincome`;
CREATE TABLE `extraincome` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `income_month` varchar(255) DEFAULT NULL,
  `money` double NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `write_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `financefee`;
CREATE TABLE `financefee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fee` double NOT NULL,
  `payout_month` varchar(255) DEFAULT NULL,
  `write_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `functionwithgroup`;
CREATE TABLE `functionwithgroup` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `function_id` int(11) NOT NULL,
  `group_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `function_`;
CREATE TABLE `function_` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `page_function` varchar(50) DEFAULT NULL,
  `page_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `goodsbill`;
CREATE TABLE `goodsbill` (
  `goods_bill_code` varchar(50) NOT NULL,
  `accept_procedure_rate` varchar(50) DEFAULT NULL,
  `accept_station` varchar(100) DEFAULT NULL,
  `carriage` double DEFAULT NULL,
  `carry_goods_fee` double DEFAULT NULL,
  `employee_code` varchar(50) DEFAULT NULL,
  `fact_deal_date` date DEFAULT NULL,
  `fetch_goods_mode` varchar(50) DEFAULT NULL,
  `help_accept_payment` double DEFAULT NULL,
  `if_audit` bit(1) DEFAULT NULL,
  `if_settle_accounts` bit(1) DEFAULT NULL,
  `insurance` double DEFAULT NULL,
  `money_of_change_pay` double DEFAULT NULL,
  `pay_kickback` double DEFAULT NULL,
  `pay_mode` varchar(50) DEFAULT NULL,
  `predelivery_date` date DEFAULT NULL,
  `receive_goods_addr` varchar(50) DEFAULT NULL,
  `receive_goods_customer` varchar(50) DEFAULT NULL,
  `receive_goods_customer_addr` varchar(50) DEFAULT NULL,
  `receive_goods_customer_code` varchar(50) DEFAULT NULL,
  `receive_goods_customer_tel` varchar(50) DEFAULT NULL,
  `reduce_fund` double DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `send_goods_addr` varchar(50) DEFAULT NULL,
  `send_goods_customer` varchar(50) DEFAULT NULL,
  `send_goods_customer_addr` varchar(50) DEFAULT NULL,
  `send_goods_customer_no` varchar(50) DEFAULT NULL,
  `send_goods_customer_tel` varchar(50) DEFAULT NULL,
  `send_goods_date` date DEFAULT NULL,
  `transfer_fee` double DEFAULT NULL,
  `transfer_station` varchar(50) DEFAULT NULL,
  `validity` bit(1) DEFAULT NULL,
  `write_bill_person` varchar(50) DEFAULT NULL,
  `write_date` date DEFAULT NULL,
  PRIMARY KEY (`goods_bill_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `goodsbillevent`;
CREATE TABLE `goodsbillevent` (
  `goods_bill_id` varchar(50) NOT NULL,
  `event_name` varchar(50) NOT NULL,
  `occur_time` datetime(6) DEFAULT NULL,
  `remark` varchar(50) NOT NULL,
  PRIMARY KEY (`goods_bill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `goodsreceiptinfo`;
CREATE TABLE `goodsreceiptinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `check_goods_record` varchar(50) DEFAULT NULL,
  `driver_name` varchar(50) DEFAULT NULL,
  `goods_revert_code` varchar(50) DEFAULT NULL,
  `rceive_goods_date` date DEFAULT NULL,
  `receive_goods_person` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `incomemonthlytemp`;
CREATE TABLE `incomemonthlytemp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `biz_fee` double NOT NULL,
  `biz_income` double NOT NULL,
  `car_carriage` double NOT NULL,
  `carriage_money` double NOT NULL,
  `convey_wage` double NOT NULL,
  `finance_fee` double NOT NULL,
  `house_rent` double NOT NULL,
  `income` double NOT NULL,
  `insurance_money` double NOT NULL,
  `manage_fee` double NOT NULL,
  `month` varchar(255) DEFAULT NULL,
  `office_fee` double NOT NULL,
  `other` double NOT NULL,
  `payout` double NOT NULL,
  `phone_fee` double NOT NULL,
  `profit` double NOT NULL,
  `unbiz_income` double NOT NULL,
  `wage` double NOT NULL,
  `water_elec_fee` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `lineoverall`;
CREATE TABLE `lineoverall` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `all_carriage_total` double NOT NULL,
  `deal_goods_station` varchar(50) DEFAULT NULL,
  `insurance_total` double NOT NULL,
  `load_station` varchar(50) DEFAULT NULL,
  `times` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `managefee`;
CREATE TABLE `managefee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `house_rent` double NOT NULL,
  `office_fee` double NOT NULL,
  `other_payout` double NOT NULL,
  `payout_month` varchar(255) DEFAULT NULL,
  `phone_fee` double NOT NULL,
  `water_elec_fee` double NOT NULL,
  `write_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `proxyfeeclear`;
CREATE TABLE `proxyfeeclear` (
  `goods_bill_code` varchar(50) NOT NULL,
  `account_receivable` double DEFAULT NULL,
  `balance_date` date DEFAULT NULL,
  `commision_rate` float DEFAULT NULL,
  `commision_receivable` double DEFAULT NULL,
  `customer_code` varchar(50) DEFAULT NULL,
  `fact_receive_fund` double DEFAULT NULL,
  `goods_pay_change` double DEFAULT NULL,
  `received_commision` double DEFAULT NULL,
  PRIMARY KEY (`goods_bill_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `routeinfo`;
CREATE TABLE `routeinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `distance` double NOT NULL,
  `end_station` int(11) DEFAULT NULL,
  `fetch_time` double NOT NULL,
  `pass_station` varchar(100) DEFAULT NULL,
  `start_station` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `sentlist`;
CREATE TABLE `sentlist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `back_cost` double NOT NULL,
  `car_card_no` varchar(50) DEFAULT NULL,
  `cash_pay` double NOT NULL,
  `driver_name` varchar(50) DEFAULT NULL,
  `goods_code` varchar(50) DEFAULT NULL,
  `goods_name` varchar(50) DEFAULT NULL,
  `goods_revert_bill_code` varchar(50) DEFAULT NULL,
  `help_accept_fund` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `pickup_pay` double NOT NULL,
  `piece_amount` int(11) NOT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `send_goods_customer` varchar(50) DEFAULT NULL,
  `send_goods_customer_tel` varchar(50) DEFAULT NULL,
  `transfer_destination` varchar(50) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `transfercominfo`;
CREATE TABLE `transfercominfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(50) DEFAULT NULL,
  `company_name` varchar(50) DEFAULT NULL,
  `detail_address` varchar(200) DEFAULT NULL,
  `link_phone` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `transferinfo`;
CREATE TABLE `transferinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `after_transfer_bill` varchar(50) DEFAULT NULL,
  `check_time` date DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `goods_bill_code` varchar(50) DEFAULT NULL,
  `transfer_addr` varchar(50) DEFAULT NULL,
  `transfer_check` varchar(50) DEFAULT NULL,
  `transfer_company` varchar(50) DEFAULT NULL,
  `transfer_fee` double DEFAULT NULL,
  `transfer_station` varchar(50) DEFAULT NULL,
  `transfer_station_tel` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `login_id` varchar(50) NOT NULL,
  `if_online` bit(1) DEFAULT b'0',
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`login_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `usergroup`;
CREATE TABLE `usergroup` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(50) DEFAULT NULL,
  `group_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `userwithgroup`;
CREATE TABLE `userwithgroup` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_id` int(11) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 2020-10-04 01:58:03

