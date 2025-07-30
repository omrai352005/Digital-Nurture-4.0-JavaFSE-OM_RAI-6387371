import { CalculateScore } from './components/CalculateScore';

function App() {
    return (
        <div>
            <CalculateScore 
                Name={"Fukuda Saa"} 
                School={" IPS  School"} 
                total={302} 
                goal={5} 
            />
        </div>
    );
}

export default App;
