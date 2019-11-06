package oopPractical2_Constructors;

public class City {
	
	private String cityName;
	private int population;
	private boolean countryCapital;
	private String country;
	
	/**
	 * 
	 * @return
	 */
	public String getCityName() {
		return cityName;
	}
	
	/**
	 * 
	 * @param cityName
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		if(population>50 || population < 0) {
			this.population = 1;
		} else {
			this.population = population;
		}
	}

	/**
	 * @return the countryCapital
	 */
	public boolean isCountryCapital() {
		return countryCapital;
	}

	/**
	 * @param countryCapital the countryCapital to set
	 */
	public void setCountryCapital(boolean countryCapital) {
		this.countryCapital = countryCapital;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", population=" + population + ", countryCapital=" + countryCapital
				+ ", country=" + country + "]";
	}
	
	public City() {
		
	}

	/**
	 * @param cityName
	 * @param population
	 * @param countryCapital
	 * @param country
	 */
	public City(String cityName, int population, boolean countryCapital, String country) {
		this.cityName = cityName;
		this.setPopulation(population);
		this.countryCapital = countryCapital;
		this.country = country;
	}
	
	
	
	
	
	
}
