package coleciones;

public class Player implements Comparable<Player> {
	public String year;
	public String name;
	public String team;
	public int hr;

	public Player(String year, String name, String team, int hr) {
		this.year = year;
		this.name = name;
		this.team = team;
		this.hr = hr;
	}

	public String getYear() {
		return year;
	}

	public String getName() {
		return name;
	}

	public String getTeam() {
		return team;
	}

	public int getHr() {
		return hr;
	}

	@Override
	public int compareTo(Player p) {	
		int resultado = 0;		
		resultado = this.name.compareTo(p.getName());
		if (resultado == 0) {
			resultado = this.team.compareTo(p.getTeam());
		}
		return resultado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hr;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((team == null) ? 0 : team.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (hr != other.hr)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (team == null) {
			if (other.team != null)
				return false;
		} else if (!team.equals(other.team))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [year = " + year + ", name = " + name + ", team = " + team + ", hr = " + hr + "]";
	}

}
