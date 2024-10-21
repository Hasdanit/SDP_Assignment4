package src.Task7;

class VersionControl {

    private Document document;


    VersionControl(Document document){

        this.document=document;

    }


    void saveVersion(String content){

        document.editContent(content);

    }


    void restoreVersion(int index){

        document.restoreToVersion(index);

    }


    void listVersions(){

        System.out.println("Available versions:");

        for(int i=0;i<document.getVersions().size();i++){

            System.out.println(i+": "+document.getVersions().get(i).getContent());

        }

    }

}
