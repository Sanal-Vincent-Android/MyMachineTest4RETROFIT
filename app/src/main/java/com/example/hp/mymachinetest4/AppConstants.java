package com.example.hp.mymachinetest4;

/**
 * Created by hp on 01-08-2017.
 */

public class AppConstants {
    public static final String APP_PACKAGE_NAME = "com.example.jesna.wecare.";
    public static final String MAIN_URL = "http://iroidtech.com/wecare/";
    public static final String API_NEWS_EVENTS = MAIN_URL+"api/news_events/list?format=json";
    public static final String API_NEWS_EVENTS_IMAGE = MAIN_URL+"uploads/news_events/";
    public static final String API_UNIT_DETAIL_IMAGE = MAIN_URL+"uploads/unit_details/";
    //Currently Only in kerala(State id = 1)
    public static final String API_GET_CITIES_BY_STATE_ID = MAIN_URL+"api/areas/districts_by_stateid?state_id=1&format=json";
    public static final String API_GET_ORGANIZATION_BY_CATEGORY_ID = MAIN_URL+"api/unit_details/unitdetails_by_id?category_id=";
    public static final String API_GET_CATEGORY = MAIN_URL+"api/units/category_units?format=json";
    public static final String API_GET_SEARCH_RESULT=MAIN_URL+"api/unit_details/unitdetails_by_id?category_id=6&format=json";
    //Gallery
    public static final String API_GET_GALLERY_IMAGE = MAIN_URL+"uploads/unit_gallery/";
    public static final String API_GET_GALLERY = MAIN_URL+"api/unit_details/unitgallery_by_id?unit_id=";


    //partnership
    public static final String API_GET_PARTNERSHIP_IMAGE = MAIN_URL+"uploads/partnership_categories/";
    public static final String API_GET_PARTNERSHIP = MAIN_URL+"api/partnership/partners?format=json";

    //volunter

    public static final String API_GET_VOLUNTER = MAIN_URL+"api/get_involved/get_involved_list?format=json";

    //volunterheader
    public static final String API_GET_VOLUNTER_HEADER = MAIN_URL+"api/get_involved/get_involved_heading?format=json";
    public static final String API_GET_VOLUNTER_HEADER_IMAGE = MAIN_URL+"uploads/get_involved/";


    //partnershipheader
    public static final String API_GET_PARTNERSHIP_HEADER = MAIN_URL+"api/partnership/partnership_heading?format=json";
    public static final String API_GET_PARTNERSHIP_HEADER_IMAGE = MAIN_URL+"uploads/partnership/";


    //Campaigns
    public static final String API_GET_CAMPAIGNS = MAIN_URL+"api/campaigns/list?format=json";
    public static final String API_GET_CAMPAIGNS_IMAGE = MAIN_URL+"uploads/campaigns/";

    //Campaignsheader

    public static final String API_GET_CAMPAIGNS_HEADER = MAIN_URL+"api/campaigns/heading_list?format=json";


    //About

    public static final String API_GET_ABOUT = MAIN_URL+"api/unit_details/unitabout_by_id?unit_id=";

    /*Tags*/
    //News and Events
    public static final String TAG_ID = "id";
    public static final String TAG_TITLE = "title";
    public static final String TAG_IMAGE = "image";
    public static final String TAG_SUBTITLE = "subtitle";
    public static final String TAG_CREATED_DATE = "created_date";
    public static final String TAG_DESCRIPTION = "description";

    /*End Tags*/

    //SearchOrganization
    public static final String TAG_CAT_TITLE= "title";
    public static final String TAG_CAT_UNIT_ID = "id";
    public static final String TAG_CAT_IMAGE = "image";
    public static final String TAG_CAT_PLACE= "place";
    public static final String TAG_CAT_DISTRICT_ID= "district_id";
    public static final String TAG_CAT_ADDRESS= "address";
    public static final String TAG_CAT_CONTACTNO= "contact_number";
    public static final String TAG_CAT_EMAIL= "email";


    //Gallery
    public static final String GALLAERY_TITLE= "title";
    public static final String GALLAERY_IMAGE= "image";
    public static final String GALLAERY_UNITID= "unit_id";
    public static final String GALLAERY_ID= "id";

    //partnership
    public static final String PARTNERSHIP_ID= "partnership_id";
    public static final String PARTNER_ID= "id";
    public static final String PARTNERSHIP_TITLE= "title";
    public static final String PARTNERSHIP_IMAGE= "image";
    public static final String PARTNERSHIP_DESCPTN= "description";

    //partnershipheader
    public static final String PARTNERSHIP_HEADER_ID= "id";
    public static final String PARTNERSHIP_HEADER_TITLE= "title";
    public static final String PARTNERSHIP_HEADER_SUBTITLE= "subtitle";
    public static final String PARTNERSHIP_HEADER_IMAGE= "image";
    public static final String PARTNERSHIP_HEADER_DESCPTN= "description";


    //Campaigns
    public static final String CAMPAIGNS_ID= "id";
    public static final String CAMPAIGNS_TITLE= "title";
    public static final String CAMPAIGNS_IMAGE= "image";
    public static final String CAMPAIGNS_DESCPTN= "description";
    public static final String CAMPAIGNS_DATE= "date";

    //Campaignsheader
    public static final String CAMPAIGNS_HEADER_ID= "id";
    public static final String CAMPAIGNS_HEADER_TITLE= "title";
    public static final String CAMPAIGNS_HEADER_IMAGE= "image";
    public static final String CAMPAIGNS_HEADER_DESCPTN= "description";
    public static final String CAMPAIGNS_HEADER_DATE= "created_date";

    //volunter
    public static final String VOLUNTER_ID= "id";
    public static final String VOLUNTER_TITLE= "title";
    public static final String VOLUNTER_HAEDERID= "involve_heading_id";
    public static final String VOLUNTER_DESCPTN= "description";

    //VolunterHeader
    public static final String VOLUNTER_HEADER_ID= "id";
    public static final String VOLUNTER_HEADER_TITLE= "title";
    public static final String VOLUNTER_HEADER_IMAGE= "image";
    public static final String VOLUNTER_HEADER_DESCPTN= "description";



    //about
    public static final String ABOUT_ID= "id";
    public static final String ABOUT_TITLE= "title";
    public static final String ABOUT_DESCPTIN= "description";
    public static final String ABOUT_UNIT_ID= "unit_id";


    private AppConstants() {
    }

    public static class Extras {

        public final static String EXTRA_CATEGORY_ID = APP_PACKAGE_NAME + "EXTRA_CATEGORY_ID";

        public final static String EXTRA_UNIT_CATEGORY_ID = APP_PACKAGE_NAME + "EXTRA_UNIT_CATEGORY_ID";
        public final static String EXTRA_UNIT_ID = APP_PACKAGE_NAME + "EXTRA_UNIT_ID";
        public final static String EXTRA_UNIT_TITLE = APP_PACKAGE_NAME + "EXTRA_UNIT_TITLE";
        public final static String EXTRA_UNIT_GMAIL = APP_PACKAGE_NAME + "EXTRA_UNIT_GMAIL";
        public final static String EXTRA_UNIT_PLACE= APP_PACKAGE_NAME + "EXTRA_UNIT_PLACE";
        public final static String EXTRA_UNIT_ADDRESS= APP_PACKAGE_NAME + "EXTRA_UNIT_ADDRESS";
        public final static String EXTRA_UNIT_CONTACTNO= APP_PACKAGE_NAME + "EXTRA_UNIT_CONTACTNO";
        public final static String EXTRA_UNIT_IMAGE= APP_PACKAGE_NAME + "EXTRA_UNIT_IMAGE";


        public final static String EXTRA_GALLERYUNIT_ID = APP_PACKAGE_NAME + "EXTRA_UNIT_ID";

        //GalleryView
        public final static String EVENT_GALLERY_ITEMS =APP_PACKAGE_NAME+ "EVENT_GALLERY_ITEMS";
        public final static String GRID_POSITION = APP_PACKAGE_NAME+"GRID_POSITION";

        //News and Events
        public final static String EXTRA_NEWS_ID=APP_PACKAGE_NAME+"EXTRA_NEWS_ID";
        public final static String EXTRA_NEWS_IMAGE= APP_PACKAGE_NAME + "EXTRA_NEWS_IMAGE";
        public final static String EXTRA_NEWS_TITLE= APP_PACKAGE_NAME + "EXTRA_NEWS_TITLE";
        public final static String EXTRA_NEWS_SUBTITLE= APP_PACKAGE_NAME + "EXTRA_NEWS_SUBTITLE";
        public final static String EXTRA_NEWS_DISCRIPTION= APP_PACKAGE_NAME + "EXTRA_NEWS_DISCRIPTION";
        public final static String EXTRA_NEWS_TIME= APP_PACKAGE_NAME + "EXTRA_NEWS_TIME";

    }
}
