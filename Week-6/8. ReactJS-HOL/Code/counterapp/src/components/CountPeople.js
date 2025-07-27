import React from 'react';

class CountPeople extends React.Component {
  constructor(props) {
    super(props);
    // Initialize entry and exit counts in state
    this.state = {
      entrycount: 0,
      exitcount: 0
    };

    // Bind methods
    this.UpdateEntry = this.UpdateEntry.bind(this);
    this.UpdateExit = this.UpdateExit.bind(this);
  }

  UpdateEntry() {
    this.setState(prevState => ({
      entrycount: prevState.entrycount + 1
    }));
  }

  UpdateExit() {
    this.setState(prevState => ({
      exitcount: prevState.exitcount + 1
    }));
  }

  render() {
    return (
      <div style={{ textAlign: 'center', marginTop: '50px' }}>
        <h2>Mall People Counter</h2>
        <div style={{ fontSize: '20px', marginBottom: '20px' }}>
          <p>Entered People: <strong>{this.state.entrycount}</strong></p>
          <p>Exited People: <strong>{this.state.exitcount}</strong></p>
        </div>
        <button onClick={this.UpdateEntry} style={buttonStyle}>
          Login
        </button>
        <button onClick={this.UpdateExit} style={{ ...buttonStyle, marginLeft: '15px' }}>
          Exit
        </button>
      </div>
    );
  }
}

// Simple button styling
const buttonStyle = {
  padding: '10px 20px',
  fontSize: '16px',
  borderRadius: '6px',
  border: 'none',
  cursor: 'pointer',
  backgroundColor: '#4CAF50',
  color: 'white',
  transition: 'background-color 0.3s ease'
};

export default CountPeople;
