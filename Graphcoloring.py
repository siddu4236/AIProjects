colors=['red','blue','green','yellow','black']
states=['andhra','karnataka','tamilnadu','kerala']
neighbors={}
neighbors['andhra']=['karnataka','tamilnadu']
neighbors['karnataka']=['andhra','tamilnadu','kerala']
neighbors['tamilnadu']=['andhra','karnataka','kerala']
neighbors['kerala']=['karnataka','tamilnadu']
colors_of_state={}
def promising(state,color):
    for neighbor in neighbors.get(state):
        color_of_neighbor=colors_of_state.get(neighbor)
        if color_of_neighbor==color:
            return False
    return True
def get_color_for_state(state):
    for color in colors:
        if promising(state,color):
            return color
def main():
    for state in states:
        colors_of_state[state]=get_color_for_state(state)
    print(colors_of_state)
main()
