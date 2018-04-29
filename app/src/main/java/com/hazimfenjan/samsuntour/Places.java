package com.hazimfenjan.samsuntour;


public class Places {
    private int mImageResorceId;
    private int mTitleId;
    private int  mDescriptionId;
    private int mLocationId;
    private int mTimeId;
    private int mPhoneId;

    /**
     * @param imageResorceId
     * @param titleId
     * @param descriptionId
     */
    public Places (int imageResorceId , int titleId , int descriptionId, int locationId, int timeId, int phoneId) {
        mImageResorceId = imageResorceId;
        mTitleId = titleId;
        mDescriptionId = descriptionId;
        mLocationId = locationId;
        mTimeId = timeId;
        mPhoneId = phoneId;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResorceId() {
        return mImageResorceId;
    }

    /**
     * Get the string title of the place resource ID.
     */
    public int getTitleId() {
        return mTitleId;
    }

    /**
     * Get the string description of the place resource ID.
     */
    public int getDescriptionId() {
        return mDescriptionId;
    }

    /**
     * Get the string Location of the place resource ID.
     */
    public int getLocationId() {
        return mLocationId;
    }
    /**
     * Get the string Opening Time of the place resource ID.
     */
    public int getTimeId() {
        return mTimeId;
    }
    /**
     * Get the string Cost of the place resource ID.
     */
    public int getPhoneId() {
        return mPhoneId;
    }


}

