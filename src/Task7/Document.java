package src.Task7;

import java.util.ArrayList;

import java.util.List;


class Document {

    private String content;

    private List<DocumentVersion> versions=new ArrayList<>();


    void editContent(String content){

        this.content=content;


        versions.add(new DocumentVersion(content));

    }


    void restoreToVersion(int index){

        if(index>=0 && index<versions.size()){

            this.content=versions.get(index).getContent();

            System.out.println("Restored to version "+index+": "+content);

        }else{

            System.out.println("Invalid version index!");

        }

    }


    String getContent(){

        return content;

    }


    List<DocumentVersion> getVersions(){ return versions; }

}
