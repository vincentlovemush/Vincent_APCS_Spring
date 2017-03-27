package textExcel;

public class FormulaCell extends RealCell{
	public FormulaCell(String formula){
		super(formula);
	}
	public double getDoubleValue (){
		String [] splitted = value.split(" ");
		double answer= 0;
		if (splitted[1].charAt(0)<77&&splitted[1].charAt(0)>65){
			SpreadsheetLocation cellLoc= new SpreadsheetLocation (splitted[1]);
			if(Spreadsheet.getCell(cellLoc) instanceof RealCell){
			answer= (RealCell)(Spreadsheet.getCell(cellLoc)).getDoubleValue();
			}
		}
		answer=(Double.parseDouble(splitted[1]));
		for (int i=2; i<splitted.length;i=i+2){
			if(splitted[i].equals("+"))
				if(splitted[i+1])
				answer=answer + Double.parseDouble(splitted[i+1]);
			if(splitted[i].equals("-"))
				answer=answer - Double.parseDouble(splitted[i+1]);
			if(splitted[i].equals("*"))
				answer=answer * Double.parseDouble(splitted[i+1]);
			if(splitted[i].equals("/"))
				answer=answer / Double.parseDouble(splitted[i+1]);
		}
		return answer;
		
	}
	public String abbreviatedCellText(){
		String formula=this.getValue()+"          ";
		return formula.substring(0,10);
	}
	public String fullCellText(){
		return "("+value+")";
	}
}
