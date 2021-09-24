/**
 * @author Andrew Pierce - ajpierce1
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Andrew Pierce - ajpierce1
 */
public class StringSorter {

	private ArrayList<String> listToSort = new ArrayList<>();
	private StringBuilder alphabeticalList = new StringBuilder();
	private StringBuilder originalList = new StringBuilder();

	/**
	 * 
	 */
	public StringSorter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param wordList
	 */
	public StringSorter(ArrayList<String> wordList) {
		// TODO Auto-generated constructor stub
		setListToSort(wordList);
		originalList = originalListOrderCreator(wordList);
		Collections.sort(listToSort);
		alphabeticalList = alphabetizedListOrderCreator(listToSort);
	}

	/**
	 * @param listToSort2
	 */
	private StringBuilder alphabetizedListOrderCreator(ArrayList<String> listToSort) {
		// TODO Auto-generated method stub
		StringBuilder newList = new StringBuilder();

		for (String s : listToSort) {
			newList.append(s + "<br>");
		}
		return newList;

	}

	/**
	 * @param wordList
	 */
	private StringBuilder originalListOrderCreator(ArrayList<String> wordList) {
		StringBuilder newList = new StringBuilder();

		for (String s : listToSort) {
			newList.append(s + "<br>");
		}
		return newList;
		// TODO Auto-generated method stub

	}

	/**
	 * @return the listToSort
	 */
	public ArrayList<String> getListToSort() {
		return listToSort;
	}

	/**
	 * @return the alphabeticalList
	 */
	public StringBuilder getAlphabeticalList() {
		return alphabeticalList;
	}

	/**
	 * @return the originalList
	 */
	public StringBuilder getOriginalList() {
		return originalList;
	}

	/**
	 * @param alphabeticalList the alphabeticalList to set
	 */
	public void setAlphabeticalList(StringBuilder alphabeticalList) {
		this.alphabeticalList = alphabeticalList;
	}

	/**
	 * @param originalList the originalList to set
	 */
	public void setOriginalList(StringBuilder originalList) {
		this.originalList = originalList;
	}

	/**
	 * @param listToSort the listToSort to set
	 */
	public void setListToSort(ArrayList<String> listToSort) {
		this.listToSort = listToSort;
	}

	public String printBothLists() {
		return "Original List: <br>" + this.getOriginalList() + "<br>" + "Alphabetized List:" + "<br>" + this.getAlphabeticalList();
	}

}
