package librarymanagement;

import java.util.ArrayList;

public class Library {

    // variables
    private String libraryName;
    ArrayList<Category> CategoriesInLibrary = new ArrayList<>();
    ArrayList<Member> membersInLibrary = new ArrayList<>();

    // getters

    public ArrayList<Category> getBooksInLibrary() {
        return CategoriesInLibrary;
    }

    public ArrayList<Member> getMembersInLibrary() {
        return membersInLibrary;
    }

    // methods

    public void addCategoryToLibrary(Category category) {
        CategoriesInLibrary.add(category);
    }

    public void removeCateogryFromLibrary(Category category) {
        CategoriesInLibrary.remove(category);
    }

    public void addMemeberToLibrary(Member member) {
        membersInLibrary.add(member);
    }

    public void removeMemberFromLibrary(Member member) {
        membersInLibrary.remove(member);
    }

}
