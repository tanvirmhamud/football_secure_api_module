#include <jni.h>
#include <unistd.h>
#include <android/log.h>
#include <stdio.h>

#define TAG "YOURAPPTAG"



JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_getdomain(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "https://gtvcricketlive.com/");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_getlive(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "fixtures/live");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_getfixturebydaye(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "fixtures/date=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_league(JNIEnv *env, jobject thiz) {

    return (*env)-> NewStringUTF(env, "leagues");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_statisticbyfixtureid(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "fixtures/statistics/fixtureid=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_standingbyleagueseason(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "standings/");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_leagueid(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "league=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_seasonid(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "season=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_teambyseasonleague(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "teams/");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_teamid(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "team=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_teamid2(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "teamid=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_playerid(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "player=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_fixturebyteam(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "teamfixtures/");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_teaminformation(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "teaminfo/");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_teamstatiaties(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "teamstatiaties/");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_fixturedetails(JNIEnv *env, jobject thiz) {

    return (*env)-> NewStringUTF(env, "fixtures/id=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_headtohead(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "fixtures/headtohead/h2h=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_linup(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "fixtures/lineups/fixtureid=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_fixturestatistic(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "fixtures/statistics/fixtureid=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_playerstatistic(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "fixtures/players/fixtureid=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_fixtureevent(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "fixtures/events/fixtureid=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_fixtureleaguedate(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "searchmatchbyleague/date=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_teamplayerlist(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "getplayers/");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_playertransfer(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "transfers/");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_singleplayerinfo(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "singleplayers/");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_playersquard(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "players/squads/player=");
}


JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_searchmatchwithoutdate(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "searchmatchwithoutdate/");
}


JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_top_1score(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "topscore/league=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_leagueid2(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "leaguefixtures/leagusid=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_trophies(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "trophies/player=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_transfer(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "transfers/player=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_topleague(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "https://starsportsofficial.com/apps/Net-Geo/football-live-tv-app/leagues-fav.json");
}


JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_poll(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "getmatch_poll?matchid=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_leaguebyteam(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "leagues/team=");
}

JNIEXPORT jstring JNICALL
Java_com_example_spors_1api_Http_api_singleleague(JNIEnv *env, jobject thiz) {
    return (*env)-> NewStringUTF(env, "leagues/id=");
}