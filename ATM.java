        private static final int FASTCASH_STATE = 5;
        private static final int ERROR_STATE = 6;
                _dButton = new JButton(" D ");
                _dButton.addActionListener(new DButtonListener());
                buttonPanel.add(_dButton);
	public void withdraw()
	{  
            if(_currentAccount.getBalance()<_pad.getValue())
            {
                setState(ERROR_STATE);
            }
            else
            {
                _currentAccount.withdraw(_pad.getValue());
            }

	}
        public void fastCashWithDraw(double fastAmount)
        {
            if(_currentAccount.getBalance()<fastAmount)
               {
                   setState(ERROR_STATE);
               }
            else
                {
                    _currentAccount.withdraw(fastAmount);
                    setState(START_STATE);
                }
        }
