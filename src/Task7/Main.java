package src.Task7;

class Main {

    public static void main(String[] args){

        Document document=new Document();

        VersionControl versionControl=new VersionControl(document);

// Edit document and save versions.

        versionControl.saveVersion("Version 1");

        versionControl.saveVersion("Version 2");

        versionControl.saveVersion("Version 3");


        versionControl.listVersions();


        versionControl.restoreVersion(1);


        System.out.println(versionControl);
