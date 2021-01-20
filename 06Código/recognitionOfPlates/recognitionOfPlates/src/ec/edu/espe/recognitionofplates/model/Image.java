/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.recognitionofplates.model;

/**
 *
 * @author Group2 Sigma Programmers
 */
public class Image {
    private int idImage;
    private float imageHigh;
    private float imageWidth;
    private float imageX;
    private float imageY;
    private String imagePath;
    
    public Image(int idImage, float imageHigh, float imageWidth, float imageX, float imageY, String imagePath) {
        this.idImage = idImage;
        this.imageHigh = imageHigh;
        this.imageWidth = imageWidth;
        this.imageX = imageX;
        this.imageY = imageY;
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Image{" + "idImage=" + idImage + ", imageHigh=" + imageHigh + ", imageWidth=" + imageWidth + ", imageX=" + imageX + ", imageY=" + imageY + ", imagePath=" + imagePath + '}';
    }
    
    public void saveImage(){
        
    }
    
    public void loadImage(){
        
    }
    
    public void cutImage(){
        
    }
    
    public void grayScaleImagen(){
        
    }

    /**
     * @return the idImage
     */
    public int getIdImage() {
        return idImage;
    }

    /**
     * @param idImage the idImage to set
     */
    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    /**
     * @return the imageHigh
     */
    public float getImageHigh() {
        return imageHigh;
    }

    /**
     * @param imageHigh the imageHigh to set
     */
    public void setImageHigh(float imageHigh) {
        this.imageHigh = imageHigh;
    }

    /**
     * @return the imageWidth
     */
    public float getImageWidth() {
        return imageWidth;
    }

    /**
     * @param imageWidth the imageWidth to set
     */
    public void setImageWidth(float imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     * @return the imageX
     */
    public float getImageX() {
        return imageX;
    }

    /**
     * @param imageX the imageX to set
     */
    public void setImageX(float imageX) {
        this.imageX = imageX;
    }

    /**
     * @return the imageY
     */
    public float getImageY() {
        return imageY;
    }

    /**
     * @param imageY the imageY to set
     */
    public void setImageY(float imageY) {
        this.imageY = imageY;
    }

    /**
     * @return the imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * @param imagePath the imagePath to set
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
}
