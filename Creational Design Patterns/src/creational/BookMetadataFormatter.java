package creational;

/*
 * USE FACTORY METHOD <3
 */

public interface BookMetadataFormatter {
    BookMetadataFormatter reset();
    BookMetadataFormatter append(Book b);
    String getMetadataString();
}
