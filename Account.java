package com.bankingapp.entity;

public class Account {
           int actid;
           String name;
           float balance;
           
           
		public Account() {
			super();
				}

		public Account(int actid, String name, float balance) {
			super();
			this.actid = actid;
			this.name = name;
			this.balance = balance;
		}
		
		public int getActid() {
			return actid;
		}
		
		public void setActid(int actid) {
			this.actid = actid;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public float getBalance() {
			return balance;
		}
		
		public void setBalance(float balance) {
			this.balance = balance;
		}
		
        public void deposit(int amt) {
        	balance+=amt;
        }
        public void withDraw(int amt) {
        	balance-=amt;
        }
}
